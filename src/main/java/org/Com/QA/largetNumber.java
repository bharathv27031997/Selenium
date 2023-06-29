package org.Com.QA;

import org.junit.Test;

import java.util.Arrays;

public class largetNumber {
    public static void main(String[] args) {

        double[] num = {10, 20, 100.01, 100};
        double max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println(" The max number is ::"+max);
    }

    @Test
    public void largetUsingStreams(){
        System.out.println(Arrays.asList(10, 20, 30, 40)
                .stream().max(Integer::compareTo).get());
    }

    @Test
    public void lar(){

        Arrays.asList(000011, 1199,19229).stream().max(Integer::compareTo).get();
    }
    @Test
    public void lare(){

       int a=10;
       int b=20;
       int large=a>b?a:b;
        System.out.println(large);
    }
}
