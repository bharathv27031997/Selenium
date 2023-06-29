package org.Com.QA;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

public class StringContainsVowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String[] str = sc.next().split(" ");
        boolean flag = false;
        for (String s : str) {
            if (s.toLowerCase().contains("a")) {
                flag = true;
            } else if (s.toLowerCase().contains("e")) {
                flag = true;
            } else  if (s.toLowerCase().contains("i")) {
                flag = true;
            } else if (s.toLowerCase().contains("o")) {
                flag = true;
            } if (s.toLowerCase().contains("u")) {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("Contains Vowels");
        } else {
            System.out.println("Not Contains vowels");
        }
    }


    @Test
    public void checkVowelsUsingStreams(){
        boolean flag = Arrays.stream("qqqqq".split(" ")).anyMatch(s->s.toLowerCase().contentEquals("aeiou") ||
                        s.toLowerCase().contains("e") ||
                        s.toLowerCase().contains("i") ||
                        s.toLowerCase().contains("o") ||
                        s.toLowerCase().contains("u"));
        System.out.println(flag);
    }

    @Test
    public void findVowelAndConsontInString(){

        String str="bharath and Venkatest. M";
        int vowelcount=0;
        int conscount=0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                vowelcount++;
             } else if (ch>='a' && ch<='z') {
                conscount++;
             }
        }
        System.out.println("Vowels ::"+ vowelcount);
        System.out.println("Consontants ::"+ conscount);
     }
}
