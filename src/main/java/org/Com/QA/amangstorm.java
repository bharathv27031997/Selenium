package org.Com.QA;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class amangstorm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num, c = 0, a;
        while (num > 0) {

            a = num % 10;
            num = num / 10;
            c = c + (a * a * a);
        }
        if (temp == c) {
            System.out.println(" ArmStrong");
        } else {
            System.out.println("Not Armstrong");
        }

    }

    @Test
    public void palindrome() {
        int num = 111;

        int rev = 0;
        int tmp = num;
        while (num > 0) {
            rev = rev*10 + num % 10;
            num = num / 10;
        }
        if (tmp == rev) {
            System.out.println("palindrome");

        } else {
            System.out.println("Not palindrome");
        }
    }

    @Test
    public void stringReplace(){
        char[] str = "a    nbbls          hdjjend ".trim().toCharArray();
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < str.length; i++) {
            if(str[i]!=' '){
                sb.append(str[i]);
            }
         }
        System.out.println(sb);
    }

    @Test
    public void readCsvFile() throws FileNotFoundException {
        int num=153;
        int c=0;
        int a=0;
        int temp=num;
        while(num>0){
            c=num%10;
            num=num/10;
            a = a+(c*c*c);

        }
        if(a==temp){
            System.out.println("The number is armstrome");
        }else{
            System.out.println(" The Number is Not armstrome");
        }

    }
}
