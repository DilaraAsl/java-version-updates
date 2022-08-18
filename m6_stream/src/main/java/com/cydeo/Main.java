package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
      // creating stream from array
      String[] courses={"Java","Spring","Agile"};
     Stream<String> courseStream= Arrays.stream(courses); // Arrays.stream returns Stream obj
        //creating stream from collection

        List<String> courseList=Arrays.asList("Java","Spring","Agile");
        Stream<String> courseStream2=courseList.stream();

        List<Course> myCourses=Arrays.asList(new Course("Java",100),new Course("DS",101),
                new Course("MS",102));
        Stream<Course> myCourseStream=myCourses.stream(); // we created a stream obj



    }
}
