package org.Com.QA;

import org.junit.Test;

 import java.util.Arrays;
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

        Arrays.asList("My name is bharath".split(" ")).stream()
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));
    }

    @Test
    public void reversUsingForLoop() {

        String[] str = "my name is bharath V".split(" ");
        StringBuilder rev = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            String str1 = str[i] + " ";
            for (int j = str1.length() - 1; i >= 0; i--) {
                rev.append(str1.charAt(j));
            }
        }
    }

    @Test
    public void palidromeUsingPointers() {

        String str = "1111";
        boolean flag = true;
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if (flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    @Test
    public void strrev() {
        String str = "bharath is my name", rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (rev == str) {
            System.out.println("palindrome" + rev);
        } else {
            System.out.println("Not Palindrome" + rev);
        }
    }

    @Test
    public void strrevUsingPointer() {
        String str = "jaj0a", rev = "";
        boolean isPalindrome = true;

        int i = 0, j = str.length() - 1;
        while (i > j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            j--;
            i++;

        }
        if (isPalindrome) {
            System.out.println("palindrome" + rev);
        } else {
            System.out.println("Not Palindrome" + rev);
        }
    }

    @Test
    public void strRevEachWord() {
        int a=10, b=20;
        String oper="+";

        switch(oper){
            case "+":{
                System.out.println(a+b);
                break;
            } case "-":{
                System.out.println(a-b);
                break;

            } case "*":{
                System.out.println(a*b);
                break;

            } case "/":{
                System.out.println(a/b);
                break;

            }
        }

    }
    @Test
    public   void revEvenWord( ) {
        String[] str = "I am joining Morgan Stanley".split(" ");

        //output :: I ma joining nagroM Stanley;
        String rev = "";

        for (int i = 0; i < str.length; i++) {
            String str1 = " "+str[i];
            if (i % 2 != 0) {
                for (int j = str1.length() - 1; j >= 0; j--) {
                    rev = rev + str1.charAt(j);
                }
            } else {
                rev = rev + str1+" ";
            }
        }
        System.out.println(rev);
    }
}
