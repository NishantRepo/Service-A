package org.example.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Testasdf {

    public static void main(String[] args) {
//        Example Input ["aaryanna", "aayanna", "airianna", "alassandra", "allanna", "allannah", "allessandra", "allianna",
//                "allyanna", "anastaisa", "anastashia", "anastasia", "annabella", "annabelle", "annebelle"]
//
//        Sample Output

//        aaryanna - 4
//        aayanna - 3
//        Explaination:-
//                aaryanna has four distinct characters: 'a', 'n', 'r', and 'y'.
//                aayanna has three distinct characters: 'a', 'n', and 'y'.

        List<String> list = Arrays.asList("aaryanna", "aayanna", "airianna", "alassandra", "allanna", "allannah", "allessandra", "allianna",
                "allyanna", "anastaisa", "anastashia", "anastasia", "annabella", "annabelle", "annebelle");

        list.stream().filter(data -> data.startsWith("aa"))
                .forEach(data -> System.out.println(data + ":"  + data.chars()
                        .distinct().count()));





        List<Integer> list1 = new ArrayList<>();
        for(int i=1; i<=100;i++) {
            list1.add(i);
        }
        list1.stream().collect(Collectors.groupingBy(data -> data%2 == 0 ? "even" : "odd"))
                .entrySet().stream().forEach(data -> System.out.println(data.getKey() +":"+ data.getValue()));

    }
}
