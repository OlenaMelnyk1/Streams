package com.epam.test.automation.java.practice14.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task8 {

    public static List<Integer> getSortedUnionTwoSubsetsIntegers(int d, int k, List<Integer> intList) {
        return Stream.concat(intList.subList(k - 1, intList.size()).stream(), intList.stream().filter(number -> number > d))
                .sorted((i, j) -> -i.compareTo(j))
                .distinct()
                .collect(Collectors.toList());
    }
}
