package org.Com.QA;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {
    public static void main(String[] args) {
        Arrays.asList(-1, 5, 7, 8, 10, 11).stream().sorted(Comparator.reverseOrder());
        int[] newnum ={1, 5, -2, -10};
        Arrays.sort(newnum);
    }
}
