package com.cydeo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        double amount1=374.56;
        double amount2=374.26;
        System.out.println(amount1-amount2); // precision is a problem
        BigDecimal b1=new BigDecimal("374.56");
        BigDecimal b2=new BigDecimal("374.26");
        System.out.println(b1.subtract(b2));

        BigDecimal b3=BigDecimal.valueOf(33.45); // static method
        BigDecimal b4=BigDecimal.valueOf(33.30);
        BigDecimal b5=BigDecimal.ONE;
        BigDecimal b6=BigDecimal.TEN;

        System.out.println(b3.subtract(b4));
        System.out.println(b5);
        System.out.println(b6);
        System.out.println(b3.multiply(BigDecimal.TEN));

        // Scaling
        BigDecimal number1=new BigDecimal("33.45");
        BigDecimal number2=new BigDecimal("33.119");

        System.out.println(number1.setScale(1, RoundingMode.FLOOR));
        System.out.println(number2.setScale(1,RoundingMode.CEILING));

        // Do not use equals() use compareTo()
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2"))); //if equal returns 0
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("5")));// if smaller returns -1
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("1")));// if bigger returns 1
    }
    class Employee{
        private String name;
        private BigDecimal salary;

    }
}
