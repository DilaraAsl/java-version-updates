package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class WordTask {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");

        // print the number of characters for each word
        words.stream()
                .map(s->s.length())
                .forEach(System.out::println);
    }
}
