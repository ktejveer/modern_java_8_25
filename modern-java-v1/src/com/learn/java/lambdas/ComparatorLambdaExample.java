package com.learn.java.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        /*
        *Prior java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
                //0 if both are same
                //1 if o1 > o2
                //-1 if o1 < o2
            }
        };

        System.out.println("Result of comparator is :" + comparator.compare(3, 2));

        Comparator<Integer> compareLambda1 = (Integer a, Integer b)->{
            return a.compareTo(b);
        };
        System.out.println("Result of comparatorLambda1 is : " + compareLambda1.compare(3, 2));

        Comparator<Integer> comparatorLambda2 = (a, b)-> a.compareTo(b);
        System.out.println("Result of comparatorLambda2 is : "+ comparatorLambda2.compare(3, 2));
    }
}
