package org.Com.QA;

import org.junit.Assert;

public class TwoArrayContainsSameChar {

    public static void str(String[] args) {
        String str1 = "bharath V";
        String str2 = "bharath V";
        boolean flag=true;
        Assert.assertEquals("The arrays are not same",str1.length(), str2.length());

        for(int i=0; i<str1.length();i++){
            if(str1.charAt(i)==str2.charAt(i)){
                flag = true;
            }else{
                flag=false;
            }
        }
        if(flag){
            System.out.println("Arrays are Same");
        }else{
            System.out.println("Arrays are not same");
        }
    }

    public static void main(String[] args) {

    }
}
