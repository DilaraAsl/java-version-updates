package com.cydeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,0,15,5,20);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

      //  Collections.reverse(list); // descending order
     //   System.out.println(list);
        Collections.sort(list,new MyComparator());
        System.out.println(list);
Collections.sort(list,(o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
        System.out.println(list);

        list.sort((o1,o2)->o1.compareTo(o2));
        System.out.println(list);

       // descending
        list.sort((o2,o1)->o1.compareTo(o2));
        System.out.println(list);






    }
}
