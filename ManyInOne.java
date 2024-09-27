package com.aditya.code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ManyInOne {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,3,6,1,12, 8,9,12,10,23,5);

        //sort in reverse order
        System.out.println("//sort in reverse order");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //sort natural
        System.out.println("//sort natural");
        list.stream().sorted().forEach(System.out::println);

        //find max
        System.out.println("//find max");
        Integer max = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);

        //find min
        System.out.println("//find min");
        Integer min = list.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);

        //find even and sum
        System.out.println("//find even sum");
        int sum = list.stream().filter(i->i%2==0).reduce(0, (a,b)-> (a+b));
        System.out.println(sum);

        //remove duplicates
        System.out.println("//remove duplicates");
        list.stream().distinct().forEach(System.out::println);

        //print multiple of 5 form the listr
        System.out.println("//print multiple of 5 from list");
        list.stream().filter(i->i%5==0).forEach(System.out::println);

        //top 3 num in list
        System.out.println("//top 3 num in list");
        list.stream().sorted(Comparator.naturalOrder()).limit(3).forEach(System.out::println);

        //max 3 num
        System.out.println("max 3 mun");
        list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

        /*

        The sorted() method in Java Streams can take a Comparator as an argument to sort elements
        based on custom criteria. If no argument is provided, it sorts the elements in their natural order
        (for example, ascending order for Integer).
         */

        //sort list in increasing order of their length
        System.out.println("sort list in increasing order of their length,..");
        List<String> listStr = Arrays.asList("spring", "microservices", "kafka", "java 8", "angular");
        listStr.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);


    }
}
