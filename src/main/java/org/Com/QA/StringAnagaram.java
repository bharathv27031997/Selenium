package org.Com.QA;

import java.util.Arrays;
import java.util.Comparator;

public class StringAnagaram extends Thread{

    public static void main(String[] args) {
        char[] str1 = "bharath V".toLowerCase().toCharArray();
        char[] str2 = "bharVath ".toLowerCase().toCharArray();
//        Arrays.sort(str1);
        Arrays.sort(str2);
        System.out.println(Arrays.equals(str1, str2));

        Arrays.asList(str1).stream().map(s->new StringBuilder(Arrays.toString(s)).reverse()).forEach(System.out::println);
        System.out.println(Arrays.asList(10, 20, 30).stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
        Arrays.asList(10, 20, 30, 10, 20, 30).stream().distinct().forEach(s->System.out.print(s+" "));

     }
}
