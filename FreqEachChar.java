package com.aditya.code;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqEachChar {
    public static void main(String[] args) {

        String inputString = "java concept of the day";

        Map<Character, Long> charCountMap = inputString.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(charCountMap);

    }
}
