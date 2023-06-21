package org.Interview_Questions;

public class numPalindrome {
    public static void main(String[] args) {
        int num = 121, rev=0;
        int temp=num;
        while (num > 0) {

            rev=rev*10+num%10;
            num=num/10;
        }
    }
 }
