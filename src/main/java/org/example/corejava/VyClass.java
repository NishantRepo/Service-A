package org.example.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class VyClass {

    public static void main(String[] args) {


        List<Integer> integers = new ArrayList<>();

        List<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add(1);
        for(Integer data: copyOnWriteArrayList) {
            copyOnWriteArrayList.remove(data);
        }
    }

    //select name, count(*) from employee
    //groupy name
    //having count(*) >1;

    private static List<Item> create() {
        Item item = new Item("1", "mobile");
        Item item1 = new Item("2", "tv");
        Item item3 = new Item("3", "laptop");
        Item item2 = new Item("4", "iphone");
        List<Item> list = new ArrayList<>();
        list.add(item);
        list.add(item2);
        list.add(item3);
        list.add(item1);
        return list;

    }
}

class Transactions {

    private List<Trnsaction> trnsactionList;

    public List<Trnsaction> getTrnsactionList() {
        return trnsactionList;
    }

    public void setTrnsactionList(List<Trnsaction> trnsactionList) {
        this.trnsactionList = trnsactionList;
    }
}

class Item {

    private String id;
    private String name;


    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
