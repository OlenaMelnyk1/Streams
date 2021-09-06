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
}
