package org.Com.QA;

public class RemoveCharFromanotherString {

    //How to remove characters from the first String which are present in the second String?
    public static void main(String[] args) {
        String str1 = "harath fffff";
        String str2 = "srikanth R";
        StringBuffer sb=new StringBuffer();

        for (int i = 0; i < str1.length(); i++) {
            int flag=0;

            for (int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i)==str2.charAt(j)){
                    flag=1;
                }
             }
            if(flag!=1){
                sb.append(str1.charAt(i));
            }
        }
        System.out.print(sb);
     }
 }
