package com.cydeo.task;

import java.util.List;

public class EmployeeDemo {
    public static void main(String[] args) {
     EmployeeData.readAll() // this static method is returning stream we don't need stream()
             // print all employee emails
             .map(Employee::getEmpEmail)
             .forEach(System.out::println);

     EmployeeData.readAll()
             // stream the phone numbers
            // .flatMap(employee->employee.getEmpPhoneNumbers().stream())
             .map(Employee::getEmpPhoneNumbers)
             // Stream the list of phone numbers
             .flatMap(List::stream)

             .forEach(System.out::println);

    }
}
