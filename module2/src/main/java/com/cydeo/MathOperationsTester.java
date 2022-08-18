package com.cydeo;

public class MathOperationsTester {
    public static void main(String[] args) {
        MathOperations m=MathOperations.SUBTRACTION;
        System.out.println( calculate(3,5,m));

    }

    public static int calculate(int a, int b, MathOperations m ){
        switch(m){
            case ADDITION:
               return a+b;

            case SUBTRACTION:
                return a-b;

            case DIVISION:
                return a/b;

            case MULTIPLICATION:
                return a*b;


        }
        return 0;
    }
}
