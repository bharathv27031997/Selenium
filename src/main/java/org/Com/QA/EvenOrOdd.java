package org.Com.QA;

import org.junit.Test;

import java.util.Arrays;

public class EvenOrOdd {

    public static void main(String[] args) {
        //using Streams
        Arrays.asList(10, 30, 40).stream().filter(s->s%2==0).forEach(System.out::println);
        Arrays.asList(10, 30, 40).stream().filter(s->s%2!=0).forEach(System.out::println);

        int[] num={10, 30, 44, 45};
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0){
                System.out.println("Even Number ::"+num[i]);
            }else{
                System.out.println("Odd Number ::"+num[i]);
            }
        }

    }
}
