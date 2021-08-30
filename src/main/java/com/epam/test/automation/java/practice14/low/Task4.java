package com.epam.test.automation.java.practice14.low;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {

    public static List<String> filterAndSortByLastDigit(int number, List<String> stringList) {
        return stringList.stream()
                .filter(str->(str.length()==number) && str.charAt(str.length()-1)>47 && str.charAt(str.length()-1)<58)
                .sorted()
                .collect(Collectors.toList());
    }
}