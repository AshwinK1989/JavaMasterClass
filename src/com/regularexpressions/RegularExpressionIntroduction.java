package com.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionIntroduction {

    public static void main(String[] args) {

        String original = "Ashwin888929Karangutkar020202";

        //In character class, “.” matches any character.
        original = original.replaceAll(".", "Y");

        System.out.println(original);

        String original1 = "Ashwin888929Karangutkar020202";

        //When we use the carot boundary matcher the regular expression should match the beginning of the string
        original1 = original1.replaceAll("^Ashwin", "Y");

        System.out.println(original1);

        String original2 = "Ashwin888929Karangutkar020202";

        //matches method, will return true if the regular expression matches, and it will return true if the whole string matches.
        System.out.println(original2.matches("^Hello")); //false

        System.out.println(original2.matches("^Ashwin")); //false
        System.out.println(original2.matches("^Ashwin888929Karangutkar020202")); //true

        //The $ boundary matcher, is preceded with the pattern and it is used to check whether the end of the string matches.
        System.out.println(original2.replaceAll("020202$", "Dadar")); //true

        //If we want to replace specific characters then we have add them in [] brackets, like [abc].
        System.out.println(original2.replaceAll("[80]", "1")); //true

        //If we want to replace [abc] only if they are followed by a specific character. Then you have add those specific characters in square bracket after abc.
        System.out.println(original2.replaceAll("[nr][80]", "1")); //true

        //If we want to replace an uppercase or lowercase letter in a string with uppercase then we have to mention it in [Hh]
        System.out.println("harry".replaceAll("[Hh]", "H"));

    //In a particular string if want to replace all the characters expect few then we have to mention those characters in a square bracket
////preceded by carot. E.g: [^ab]. When we use Carot as the first character inside the square bracket then it’s a Character class not a
////boundary matcher. So it will negate the functionality of checking for the start of the string and it will check for all the
////characters instead of a and b.
        String original3 = "Ashwin888929Karangutkar020202";
        System.out.println(original3.replaceAll("[^sw]", "k"));

        //We can also specify the range of characters that we need to replace in square brackets. E.g: [a-f][5-10]
        System.out.println(original3.replaceAll("[a-w0-1]", "x"));

        //To turn off the case sensitivity we need to add (?i).
        System.out.println(original3.replaceAll("(?i)[a-w0-1]", "x"));

        //In order to replace all numbers in a string we can use following regular expression: [0-9] OR [\\d]
        System.out.println(original3.replaceAll("[\\d]", "x"));


        String whiteSpace = "My name is Ashwin";

        //In order to replace white spaces from the string we use following expression: [\\s]
        System.out.println(whiteSpace.replaceAll("[\\s]", ""));


        System.out.println(original3.replaceAll("[\\w]", "x"));

        //If we want to surround words with specific characters then we can make use \\b
        System.out.println(whiteSpace.replaceAll("\\b", "x"));


        String original4 = "abcdeeefgh";
        System.out.println(original4.replaceAll("^abcde{3}", "x"));

        System.out.println(original4.replaceAll("^abcde+", "x"));

        String original5 = "abcdfgh";

        //Now we want to match even if there are no e’s so in that case we will make use of *. E.g. abcde*.
        System.out.println(original5.replaceAll("^abcde*", "x"));


        String original6 = "abcdeeeefgh";

        //If don’t know the number of e’s then we can also specify the range in curly braces.  E.g: abcde{2,4}
        System.out.println(original6.replaceAll("^abcde{2,4}", "x"));

        System.out.println(original6.replaceAll("e+f*g", "x"));


        String patternText = "Dadar Ashwin QA Engineer Ashwin";

        Pattern pattern = Pattern.compile(".*Ashwin.*");

        Matcher matcher = pattern.matcher(patternText);

        System.out.println(matcher.matches());

        matcher.reset();

        /*Since we want the number of occurences in the string we will change the regex to Ashwin instead of .*Ashwin.*
          Since it checks for one occurence in entire string*/

        String patternText1 = "Dadar Ashwin QA Engineer Ashwin";

        Pattern pattern1 = Pattern.compile("Ashwin");

        Matcher matcher1 = pattern1.matcher(patternText1);

        System.out.println(matcher1.matches());

        /*We can make use of matcher method only once, we cannot utilize the matcher method twice.
          Matcher method has an internal state and is updated when we use it.
          So in order to use matcher method again we need to reset the state of matcher method.*/
        matcher1.reset();

        int count=0;

        while(matcher1.find()) {

            count++;

            System.out.println("The occurence count "+count +"The start index "+matcher1.start()+ " The End Index "+matcher1.end());
        }


        Pattern pattern2 = Pattern.compile("Ashwin");

        Matcher matcher2 = pattern2.matcher(patternText1);

        System.out.println(matcher2.matches());


        System.out.println("harry".replaceAll("[H|h]arry","Larry"));


        System.out.println("abchefg".replaceAll("[^h]","k"));

        System.out.println("9820985636".replaceAll("[98\\w]","k"));




    }
}
