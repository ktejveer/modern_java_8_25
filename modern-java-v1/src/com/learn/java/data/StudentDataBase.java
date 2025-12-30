package com.learn.java.data;

import java.util.Arrays;
import java.util.List;

public class StudentDataBase {
    public static List<Student> getAllStudents(){
        /*
        * 2nd grade students
         */
        Student student1 = new Student("Rajendra Kumar", 2, 3.6, "name", Arrays.asList("swimming", "basketball", "volleyball"));
        Student student2 = new Student("Tejveer Kumar", 2, 3.8, "female", Arrays.asList("swimming", "gymnastics", "soccer"));

        /*
        * 3rd grade students
         */
        Student student3 = new Student("Aditya Kumar Sharma", 3, 4.0, "female", Arrays.asList("swimming", "gymnastics", "aerobics"));
        Student student4 = new Student("Pushpendra Kumar Sharma", 3, 3.9, "male", Arrays.asList("swimming", "gymnastics", "soccer"));

        /*
         * 4th grade students
         */
        Student student5 = new Student("Mayank Sharma", 4, 3.5, "female", Arrays.asList("swimming", "dancing", "football"));
        Student student6 = new Student("Alok Sharma", 4, 3.9, "male", Arrays.asList("swimming", "basketball", "baseball", "football"));

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6);
        return students;
    }
}
