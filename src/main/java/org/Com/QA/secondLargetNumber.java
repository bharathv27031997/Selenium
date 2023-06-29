package org.Com.QA;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class secondLargetNumber {
    public static void main(String[] args) {

        int[] num={10, 20, 30, 40};
        int larget = 0, secondLrg = 0, thirdLarg=0;
        for (int i = 0; i <num.length ; i++) {
            if(num[i]>larget){
                thirdLarg=secondLrg;
                secondLrg=larget;
                larget=num[i];

            }else if(num[i]>secondLrg){
                thirdLarg=secondLrg;
                secondLrg=num[i];

            } else if(num[i]>thirdLarg){
                thirdLarg=num[i];

            }
         }
        Arrays.asList(10, 20, 30).stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("The largest num is::"+larget);
        System.out.println("The second Largest num is::"+secondLrg);
        System.out.println("The Third Largest num is::"+thirdLarg);
    }
    @Test
    public void secondLargetStream(){
        int largestnum = Arrays.asList(10, 20, 30).stream().sorted(Comparator.reverseOrder()).skip(0).findFirst().get();
        int secondlarget = Arrays.asList(10, 20, 30).stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

     }

}
