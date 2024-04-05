package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(0,0,1,1,1,2,2,3,3,4));
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(num);
        System.out.println(lhs);

        System.out.println(num.stream().distinct().collect(Collectors.toList()));


    }
}
