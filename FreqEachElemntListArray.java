package com.aditya.code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqEachElemntListArray {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("facebook", "twitter", "twitter", "insta", "insta", "insta", "snap");
        Map<String, Long> count = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(count);
    }
}
