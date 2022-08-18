package com.cydeo;

public enum MathOperations {
    MULTIPLICATION('*'),DIVISION('/'),ADDITION('+'),SUBTRACTION('-');
 //private MathOperations(){
//    System.out.println("Constructor");
//}
private char operator;
MathOperations(char operator){
    this.operator=operator;

}

    public char getOperator() {
        return operator;
    }
}
