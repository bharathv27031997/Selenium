package org.Com.QA;

import org.junit.Test;

import java.util.stream.LongStream;

public class FactorialNumber {

    public static void main(String[] args) {
        int num=10, fac=1;

        for(int i=1; i<num;i++){
            fac =fac * i;
        }
        System.out.println(fac);
    }

    @Test
    public void factUsingStreams() {
        System.out.println(LongStream.rangeClosed(1, 10).reduce(1, (long x, long y)->x*y));

    }
}
