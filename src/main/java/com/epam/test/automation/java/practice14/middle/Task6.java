package com.epam.test.automation.java.practice14.middle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {

    public static List<String> shouldReturnStringWithFirstLetterDigitAndLengthEqualsNumber
            (List<Integer> numbers, List<String> stringList) {

        return numbers.stream()
                .map(n-> stringList.stream()
                        .filter(l->(l.length()==n && l.charAt(0)>47 && l.charAt(0)<58 ))
                        .findFirst()
                        .orElse("Not Found"))
                .collect(Collectors.toList());
    }
}
