package org.Com.QA;

public class StringRotational {
    public static void main(String[] args) {
        String str1="bharath V";
        String str2="bharath Vbharath V";

        str1=str1.concat(str1);
        if(str1.contains(str2)){
            System.out.println("the String are rotations");
        }else{
            System.out.println("The String are not rotational");
        }
    }
}
