package com.epam.test.automation.java.practice14.low;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {

    public static List<String> getSortedAscOddValues(List<Integer> intList) {
        return intList.stream()
                .filter(in->in%2!=0)
                .sorted()
                .map(in->Integer.toString(in))
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<Integer> myList=new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6));
//                new ArrayList<String>(
//                List.of("8DC3", "4F", "B", "3S", "S3", "A1", "2A3G", "1B"));
//
        System.out.println(getSortedAscOddValues(myList));
    }
}
