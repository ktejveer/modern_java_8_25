package com.learn.java.functional_interfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    //Method to print students
    public static void printStudents(){
        Consumer<Student> consumer = student-> System.out.println(student);
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(consumer);
    }

    // Method to print name and activities
    public static void printNameAndActivities(){
        Consumer<Student> consumer1 = student-> System.out.print(student.getName());
        Consumer<Student> consumer2 = student-> System.out.println(student.getActivities());
        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(consumer1.andThen(consumer2));
    }

    //Main method
    public static void main(String[] args) {
        Consumer<String> c1 = (s)-> System.out.println(s.toUpperCase());
        c1.accept("Java 8");
        printStudents();

        printNameAndActivities();
    }
}
