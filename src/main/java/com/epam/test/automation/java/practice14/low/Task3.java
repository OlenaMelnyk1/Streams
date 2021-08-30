package com.epam.test.automation.java.practice14.low;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static List<String> getListExtremeLetters(List<String> list) {
       return list.stream()
                .map(l->l.substring(0,1)+l.charAt(l.length()-1))
                .collect(Collectors.toList());
    }
}
