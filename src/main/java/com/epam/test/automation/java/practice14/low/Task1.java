package com.epam.test.automation.java.practice14.low;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static List<String> filterByFirstAndLastCharacter(char symbol, List<String> stringList) {
        return stringList.stream()
                .filter(list->(list.length()>2 && list.charAt(0)==list.charAt(list.length()-1)&& list.charAt(0)==symbol))
                .collect(Collectors.toList());
    }
}
