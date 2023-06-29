package org.Com.QA;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stringToInt {


    @Test
    public void stringToInt() {

        String str="12121";
        int num=0;
        for(int i=0;i<str.length();i++){
            num=num*10 + str.charAt(i)-'0';
        }
    }


    @Test
    public static void main(String[] args){

        int num=22;
        if (num%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }

        Arrays.asList(11, 66, 44).stream().filter(s->s%2!=0).forEach(System.out::println);
    }
}

