package org.example.corejava;

import org.example.model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestsDeom {
    public static void main(String[] args) {


        List<Employee> list = List.of(
                new Employee(1, "nishant", "IT", 5000),
                new Employee(1, "prasnat", "HR",6000),
                new Employee(1, "gdgd", "IT",7000),
                new Employee(1, "qwe", "INFRA", 3000),
                new Employee(1, "fgax", "SALE", 4000)

        );
        Map<String, List<Employee>> map = list.stream().collect(Collectors.groupingBy(data -> data.getDept()));
        System.out.println(map);

        Map<String, Double> fdfd = list.stream().collect(Collectors.groupingBy(data -> data.getDept(), Collectors.averagingInt(data -> data.getSal())));
        System.out.println("avarage");
        System.out.println(fdfd);
    }
}
