package com.Hillel.lecture16;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    String [] arrayStrings = {"a","b","c"};
        System.out.println(Arrays.toString(arrayStrings));
        CollectionUtils.reverseArray(arrayStrings);
        System.out.println(Arrays.toString(arrayStrings));

        System.out.println("===========");

        List<Number> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<String> emptyList = new ArrayList<>();

        System.out.println(CollectionUtils.isEmpty(list)); // not empty list;
        System.out.println(CollectionUtils.isEmpty(emptyList)); // empty list;
        System.out.println(CollectionUtils.isEmpty(null)); // just null;
    }
}
