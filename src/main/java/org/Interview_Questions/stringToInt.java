package org.Interview_Questions;

import org.junit.Test;

public class stringToInt {


    @Test
    public void stringToInt() {
        String str = "1111";
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            num = num * 10 + str.charAt(i) - '0';
        }
        System.out.println("The Number is ::" + num);
    }
}

