package org.Com.QA;

import org.junit.Test;

public class stringConcat {

    public static void main(String[] args) {
        String str1="helloeducative";
        String str2="educativehello";

        if(str1.length()!=str2.length()){
            System.out.println("The Strings are not 0 Rotational");
        }else{
            str1=str1.concat(str1);
            System.out.println(str1);
            if(str1.contains(str2)){
                System.out.println("The String are rotational");
            }else{
                System.out.println("The Strings are not rotational");
            }
        }

    }
    @Test
    public void concat(){
        String str1="ABC";
        String str2="ABC";
        String str3="ABC";
        String str4=str1.concat(str2).concat(str3);
        String str5=str4.concat(str3);
        System.out.println(str4);
     }
}
