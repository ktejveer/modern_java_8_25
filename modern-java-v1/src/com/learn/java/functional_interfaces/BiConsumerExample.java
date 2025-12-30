package com.learn.java.functional_interfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    //Method for getting name and activities
    public static void nameAndActivitys(){
        BiConsumer<String, List<String>> biConsumer = (name, activities)-> System.out.println(name+" : "+ activities);
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(student-> biConsumer.accept(student.getName(), student.getActivities()));
    }

    //Main method
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (str1, str2)->{
            System.out.println("Str1 : " + str1 + " , str2 : " + str2);
        };
        biConsumer.accept("Hello", "Java");
        BiConsumer<Integer, Integer> multiply = (a, b)-> System.out.println("Multiplication of a * b is : " + (a * b));
        BiConsumer<Integer, Integer> divide = (a, b)-> System.out.println("division of a / b is : " + (a / b));
        multiply.andThen(divide).accept(10, 5);

        nameAndActivitys();
    }
}
