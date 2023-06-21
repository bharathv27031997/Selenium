package org.Interview_Questions;

import java.util.*;

public class fibanoccySeries {
    public static void main(String[] args) {
        int a=0, b=0, c=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter The number");
        int num=sc.nextInt();
        for (int i = 0; i < num; i++) {
            a=b; b=c; c=a+b;
            System.out.println(c+"");
        }
    }
}
