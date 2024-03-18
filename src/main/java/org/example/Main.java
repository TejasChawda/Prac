package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        add();
    }

    public static void add(){
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(4);

        Stream<Integer> ans = nums.stream().sorted();

        System.out.println(ans);

    }
}