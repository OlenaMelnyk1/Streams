package com.epam.test.automation.java.practice14.low;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static List<Integer> sortAscLengthsOfStrings(List<String> stringList) {
        return stringList.stream()
                .map(string -> string.length())
                .sorted()
                .collect(Collectors.toList());
    }
}
