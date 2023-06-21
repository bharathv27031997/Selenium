package org.Interview_Questions;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stringPalindrome {

    public static void main(String[] args) {
        String str = "geeg", rev = "";
        String tmp = str;
        char ch;
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (tmp.equals(rev)) {
            System.out.println(" Palindrome ::" + rev);
        } else {
            System.out.println(" Not Palindrome ::" + rev);
        }
    }


    @Test
    public void stringReverse() {
        String str = "abcba";
        StringBuffer bf = new StringBuffer(str);
        String rev = bf.reverse().toString();
        if (str.equals(rev)) {
            System.out.println("Palindrome" + rev);
        } else {
            System.out.println("Not Palindrome" + rev);

        }
    }


    @Test
    public void revString() {
        String str = "Interview For QA Role";
        String rev = "";
        for (int i = str.length() - 1; i > 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }

    @Test
    public void revStringStream() {

        String str ="my name ";
      String  rev="";
        for (int i = str.length(); i >0 ; i--) {
            rev=rev +str.charAt(i);
        }
        System.out.println(Arrays.asList(str.split(" ")).stream().map(s->new StringBuilder(s).reverse()).collect(Collectors.joining(" ")));
    }
}
