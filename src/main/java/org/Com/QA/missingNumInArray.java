package org.Com.QA;

import java.util.Scanner;

public class missingNumInArray {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] inptnum=new int[n];
        for(int i=0;i<=n-2;i++){
            inptnum[i]=sc.nextInt();
        }

        int sumOfAllNum = (n*(n+1))/2;
        int sum=0;
        for (int i=0;i<inptnum.length;i++){
            sum=sum+inptnum[i];
        }
        int misNum=sumOfAllNum-sum;
        System.out.println(" The misssing Number is :;"+misNum);

     }
}
