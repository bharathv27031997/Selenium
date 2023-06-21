package org.Interview_Questions;

public class removeCharFromString {
    public static void main(String[] args) {
        String str = "Automation";
        String strrep = null;
        String s = str.substring(0, 1) + str.substring(2);

        System.out.println(s);
    }
}
