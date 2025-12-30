package com.learn.java.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /*
        *prior Java 8
         */
        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                System.out.println("Inside Runnable Interface");
            }
        };
        new Thread(runnable).start();

        // Java 8 Lambda Syntax
        //()->{};
        Runnable runnableLambda = ()->{
            System.out.println("Inside Runnable Lambda 1");
        };
        new Thread(runnableLambda).start();

        Runnable runnableLambda1 = ()-> System.out.println("Inside Runnable Lambda 2");
        new Thread(runnableLambda1).start();

        new Thread(()-> System.out.println("Inside runnable Lambda 3")).start();
    }
}
