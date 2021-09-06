package com.epam.test.automation.java.practice14.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task7 {

    public static List<Integer> getSortedDifferenceBetweenSubsets(int number, List<Integer> integerList) {
        return Stream.stream().filter(i->(i%2==0))
        .forEach(l-> if
        integerList.subList(number,integerList.size()).stream()
                .filter(k-> (k!=l)));
        };

     .collect(Collectors.toCollection(ArrayList::new));

        ,integerList.subList(number,integerList.size()).stream())
        .noneMatch()


                .forEach(i-> {
                    for (int l:integerList.subList(number,integerList.size()))
                         { if (i==l)

                    }
                })
                .collect(Collectors.toList())


                .filter(l->
                    if ()

                    for (i:integerList.stream()
                            .filter(i->(i%2==0))
                            .collect(Collectors.toList())){
                        if l==i
                    }
                }
        if l==
                        ;);
        /*integerList.stream()
                .filter(i->(i%2==0))
                .collect(Collectors.toList());

    }
    public static void main(String[] args) {
        //List<String > myList=new ArrayList<String>(
        // List.of("1aa", "aaa", "1", "a"));
        List<Integer> myList=new ArrayList<Integer>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
                int number = 5;
        //List<Integer > myListIn=new ArrayList<Integer>(
                //List.of(1, 3, 4));
        System.out.println(getSortedDifferenceBetweenSubsets(number,myList));
    }
*/
}