package org.Com.QA;

import org.junit.Test;

import java.util.stream.Stream;

public class compareTwoCharArrays {
    public static void main(String[ ] args) {

        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"a", "c", "c"};
        if(checkEquality(s1, s2)){
            System.out.println("The Strings are Equal");
        }else{
            System.out.println(" The Strings are not Equal");
        }

     }

    public static boolean checkEquality(String[] s1, String[] s2){
        boolean flag=true;
        if(!(s1.length == s2.length)){
            return flag=false;
        }

        if(s1==s2){
            return flag=true;
        }

        if(s1==null || s2==null){
            return flag=false;
        }

        for (int i = 0; i <s1.length; i++) {
            if(s1[i].equals(s2[i])){
                return flag=true;
            }
        }
        return flag;
    }


    @Test
    public void testarrays(){

        char[] str1 = "abcd".toCharArray();
        char[] str2 = "afcd".toCharArray();
        boolean flag=true;
        if(str1.length ==str2.length){
            flag=true;
        }
        if(str1==str2){
            flag=true;
        }
        for (int i = 0; i < str1.length; i++) {
            if(str1[i]!=str2[i]){
                flag=false;
            }

        }
        if (flag){
            System.out.println("equal");
        }else {
            System.out.println("Not Equal");
        }
      }
}
