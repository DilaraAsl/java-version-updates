package com.cydeo;

public enum ProjectStatus {
    OPEN, CLOSED, PROGRESS("IN PROGRESS");
    String str;
    ProjectStatus(){};
    ProjectStatus(String str){
        this.str=str;
    }
}
