package org.Com.QA;

import java.util.Arrays;
import java.util.stream.Collectors;

public class stringArrayToString {

    public static void main(String[] args) {
        String[] str = "bharath v is automation tester".split(" ");
        char[] str1 = "bharath v is automation tester".toCharArray();
        Arrays.stream(str).collect(Collectors.joining());
        Arrays.toString(str);
        String.valueOf(str1);
     }


}
