package org.Interview_Questions;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

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
        System.out.println("The larget num is::"+larget);
        System.out.println("The second Largest num is::"+secondLrg);
        System.out.println("The Third Larget num is::"+thirdLarg);
    }
@Test
    public void secondLargetStream(){
        System.out.println(Arrays.asList(10,20,55).stream().sorted(Comparator.reverseOrder()).skip(0).findFirst().get());
    }
}
