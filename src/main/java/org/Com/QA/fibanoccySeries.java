package org.Com.QA;

import com.google.common.collect.Streams;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fibanoccySeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get Fibonacci Series");
        int n = sc.nextInt();
        int a = 0, b = 0, c = 1;
        for (int i = 0; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a);
        }
    }

    @Test
    public void fibonacciSeriesyUsingWhile() {

        int n = 10;
        int count = 0, a = 0, b = 0, c = 1;
        while (count < n) {

            a = b;
            b = c;
            c = a + b;
            System.out.println(a);
            count++;
        }
    }

    @Test
    public void fibStreams(){

        Stream.iterate(new int[]{0, 1}, f-> new int[]{f[1], f[0]+f[1]})
                .limit(10)
                .map(n->n[0])
                .forEach(System.out::println);
    }
}
