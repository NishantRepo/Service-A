package org.example.corejava;

import java.util.ArrayList;
import java.util.List;

public class TestJavaclass {

    public static void main(String[] args) {
        //list contatins
        int input = 10;

        List<Integer> list = List.of(1,3,4,5,7,8,9,10);

        System.out.println(list.contains(10));

        List<String> stringList = List.of("ewewe", "ffdfd", "qwsd");
        List<String> up = stringList.stream().map(String::toUpperCase).toList();
        up.forEach(System.out::println);

    }
}
