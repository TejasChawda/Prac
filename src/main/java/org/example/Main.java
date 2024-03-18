package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        list();
    }

    public static void list(){
        List<Integer> li = new ArrayList<>();
        li.add(23);
        li.add(25);
        li.add(34);
        li.add(46);

        Stream<Integer> n = li.stream().peek(System.out::println);
    }
}