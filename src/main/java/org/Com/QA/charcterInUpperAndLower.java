package org.Com.QA;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class charcterInUpperAndLower {
    @Test
    public void noOfCharsInUpperAndLowerCase(){
        String str="BHaraTHV";
        int upperCase=0;
        int lowerCase=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                upperCase++;
            }else{
                lowerCase++;
            }
        }
        System.out.println("UpperCase ::"+upperCase);
        System.out.println("lowerCase ::"+lowerCase);
    }


    @Test
    public void s() {
        char[] str = "BHarath".toLowerCase().toCharArray();
        int[] freq = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i] == str[j]) {
                    freq[j]++;
                    str[i] = '0';
                }
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != ' ' || freq[i] != '0') {
                System.out.println(str[i]+":"+freq[i]);
            }
        }
    }
    @Test
    public void lowerToUpperCaseInChar() {

        String[] input ="Hi There My Name Is V Bharath".split(" ");
        String output ="hI tHERE mY nAME iS v bHARATH";

        String newstr="";

        for(int i=0;i<input.length;i++){
            String str=input[i]+" ";

            for(int j=0;j<str.length();j++){
                char ch =str.charAt(j);

                if(Character.isLowerCase(ch)){
                    String uppstr = String.valueOf(Character.toUpperCase(ch));
                    newstr=newstr+uppstr;

                }else if(Character.isUpperCase(ch)){
                    String lowStr  = String.valueOf(Character.toLowerCase(ch));
                    newstr=newstr+lowStr;
                }else {
                    newstr=newstr+" ";
                }
            }
        }
        System.out.println(newstr);
    }

    @Test
    public void test(){

        String input = "Bharath", output="";
        String outpu = "bHaRaTh";
        for (int i = 0; i < input.length(); i++) {
            char ch=input.charAt(i);
            if(i%2!=0){
                String str= String.valueOf(Character.toUpperCase(ch));
                output=output+str;
            }else{
                String str= String.valueOf(Character.toLowerCase(ch));
                output=output+str;
            }
        }
        System.out.println(output);
    }
}
