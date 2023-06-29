package org.Com.QA;

public class RomenNumberToInteger {

    public static void main(String args[]) {
        String inputRoman= "LXVII";
        System.out.println("The Integer value of given Roman number is: "+romanToInt(inputRoman));
    }

    public static int NumValue(char rom) {
        if (rom == 'I')
            return 1;
        if (rom == 'V')
            return 5;
        if (rom == 'X')
            return 10;
        if (rom == 'L')
            return 50;
        if (rom == 'C')
            return 100;
        if (rom == 'D')
            return 500;
        if (rom == 'M')
            return 1000;
        return -1;
    }
    public static int romanToInt(String str) {
        int sum = 0;
        for (int i=0; i<str.length(); i++) {
            int s1 = NumValue(str.charAt(i));
            if (i+1 <str.length()) {
                int s2 = NumValue(str.charAt(i+1));
                if (s1 >= s2) {
                    sum = sum + s1;
                }
                else{
                    sum = sum - s1;
                }
            }
            else {
                sum = sum + s1;
            }
        }
        return sum;
    }
}
