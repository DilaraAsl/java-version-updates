package com.cydeo;

import java.math.BigDecimal;

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

    }
    class Employee{
        private String name;
        private BigDecimal salary;

    }
}
