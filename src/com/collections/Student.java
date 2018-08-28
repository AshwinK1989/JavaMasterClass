package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {

   public int marks;
   public String name;
   public int rollno;

    public Student(int marks, String name, int rollno) {
        this.marks = marks;
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return marks == student.marks &&
                rollno == student.rollno &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(marks, name, rollno);
    }

    @Override
    public String toString() {
        return "Student{" +

                "marks=" + marks +
                ", name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }

    @Override
    public int compareTo(Student stud) {

        return marks>stud.marks?1:marks<stud.marks?-1:0;
    }


}


class CollectionComparator {


    public static void main(String[] args) {

        List<Student> studLists = new ArrayList<>();
        studLists.add(new Student(100,"Ashwin",1));
        studLists.add(new Student(55,"Vijay",2));
        studLists.add(new Student(30,"Ajay",10));

        Collections.sort(studLists);

        for (Student studList: studLists ) {

            System.out.println(studList);
        }

    }



}


