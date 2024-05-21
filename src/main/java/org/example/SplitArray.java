package org.example;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SplitArray {
    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 3;

		/* expected Output
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]
		*/

        List<int[]> list = splitArray(original, splitSize);
        list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
    }

    public static List<int[]> splitArray(int[] array, int splitSize) {

        List<int[]> result = new ArrayList<>();
        int count = 0;

        while (count < array.length) {
            int end = count + splitSize;
            int[] arr = Arrays.copyOfRange(array, count, Math.min(end, array.length));
            count += splitSize;
            result.add(arr);
        }
        return result;
    }
}

class RotateArrayByKPositions {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int k = 4;

        System.out.println(Arrays.toString(rotateArray(array, k)));
    }

    public static int[] rotateArray(int[] array, int k) {
        int c = array.length - k;
        int[] a1 = Arrays.copyOfRange(array, c, array.length);
        int[] b1 = Arrays.copyOfRange(array, 0, c);

        int[] c1 = new int[array.length];

        System.arraycopy(a1, 0, c1, 0, a1.length);
        System.arraycopy(b1, 0, c1, a1.length, b1.length);

        return c1;
    }
}
