package org.Com.QA;

public class String_Retrive {

    public static void main(String[] args) {
        String[] url = "https://test-test.test.com/est/Sasdfsasdsf12341234wedfwffsdf235213452/en_US".split("/");
        System.out.println(url[4]);
        String str="bharath V";
        String str2 = "BHARATH V";
        System.out.println(str.equalsIgnoreCase(str2));
    }
}