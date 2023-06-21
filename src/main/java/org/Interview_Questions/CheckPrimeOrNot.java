package org.Interview_Questions;

import org.junit.Test;

public class CheckPrimeOrNot {
    @Test
    public void testPrime(){
        int num=20, primenum=0;
        boolean isPrime=true;
        for (int i = 2; i <num/2 ; i++) {
            primenum=num%2;
            if(primenum==0){
                isPrime=false;
            }

        }
        if(isPrime){
            System.out.println("Prime Number ::"+num);
        }else{
            System.out.println("Not Prime Number ::"+num);

        }
    }


    @Test
    public void primenum(){
        int num=7;
        int prime=0;
        boolean flag=true;
        for(int i=2;i<num/2;i++){
            prime=num%2;
            if (prime==0){
                flag=false;
            }
        }
     }
}
