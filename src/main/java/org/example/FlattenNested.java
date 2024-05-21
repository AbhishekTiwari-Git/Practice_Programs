package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlattenNested {
    public static void main(String[] args){
        Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };

        System.out.println(Arrays.toString(flatten(array).toArray()));
    }

    public static Stream<?> flatten(Object[] array){
        return Arrays.stream(array).flatMap(o -> o instanceof Object[] ? flatten((Object[]) o) : Stream.of(o));
    }
}
