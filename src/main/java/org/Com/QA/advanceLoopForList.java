package org.Com.QA;

import com.google.common.collect.Iterators;
import com.google.common.collect.Streams;
import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

public class advanceLoopForList extends Thread {
    public void amstrong( ) {

        List<Integer> lat = new ArrayList<>();
        lat.add(10);
        lat.add(20);
        lat.add(30);
        lat.add(50);
        lat.add(60);

        Iterator<Integer> itr = lat.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {

        String str1="helloeducative";
        String str2="educativehello";
        boolean flag = true;

        if(str1.length()!=str2.length()){
            flag=false;
        }
        str1=str1.concat(str1);
        if(str1.contains(str2)){
            System.out.println("The Given Strings are Rotational");
        }else{
            System.out.println("The Strings are not rotational");
        }


    }

    @Test
    public void testPrime(){
        int num=7, prime=0;
        boolean flag=true;
        for (int i = 5; i < num/2; i++) {
            prime = num % i;
            {
                if (prime == 0) {
                    flag = false;
                }
            }
        }
        if(flag){
            System.out.println("prime Number");
        }else{
            System.out.println("Not Prime");

        }



    }
}

