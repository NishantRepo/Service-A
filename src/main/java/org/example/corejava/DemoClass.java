package org.example.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoClass {

    public static void main(String[] args) {
//        String str = "nishant mohan raj raj mohan";
//        Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(data -> data, Collectors.counting()))
//                .entrySet().forEach(data -> System.out.println(data.getKey() +":"+ data.getValue()));


        // ..employee and address
        //id nae sal address_id
        //id city pincode
        //get list of emp where city =pune and sa; > 50000
        // group by city
        //who is having sal > 50000

        // select emp.city, count(emp.*) from employee emp join address add
        // on add.id== emp.add_id
        //group by emp.city having emp.sal > 50000;


        List<String> list = new ArrayList<>();
        list.add("nishant");
        boolean result = list.add("nishant");
        System.out.println(result);

        HashSet<String> set = new HashSet<>();
        set.add("ggfffgf");
        boolean fdfd = set.add("ggfffgf");
        System.out.println(fdfd);
        // divide list using java 8

        List<Integer> numbers = List.of(3, 6, 7, 88, 33, 55, 66, 878,3);
        Map<String, List<Integer>> map = numbers.stream().collect(Collectors.groupingBy(data -> data % 2 == 0 ? "EVEN" : "ODD", Collectors.toList()));


        System.out.println("even odd values");
        map.entrySet().forEach(data -> System.out.println(data.getKey() + ":" + data.getValue()));

        List<String> words = Arrays.asList("listen", "silent", "enlist", "rat", "tar", "art", "god", "dog");
        words.stream().collect(Collectors.toMap(data -> data, String::length));
        Map<String, List<String>> geege = words.stream().collect(Collectors.groupingBy(data -> {
            char[] arr = data.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }, Collectors.toList()));

        System.out.println("grouped anagram words");
        System.out.println(geege);

        Map<String, Integer> map11 = words.stream().collect(Collectors.toMap(data -> data, String::length));

        System.out.println(map11);

        EmpInterface emp = (name, id) -> {System.out.println(name +" : "+ id);};
        emp.show("nishant", 1);

        Stream<String> limit = Arrays.asList("listen", "silent", "enlist", "rat", "tar", "art", "god", "dog", "listen").stream();


        Map<String, Integer> gdgd = limit.collect(Collectors.toMap(data -> data, data -> data.length(), (first, last) -> last));
        gdgd.entrySet().forEach(data -> System.out.println(data.getKey() +": "+ data.getValue()));

    }




























    //rst endpoint/ create

    //
}
