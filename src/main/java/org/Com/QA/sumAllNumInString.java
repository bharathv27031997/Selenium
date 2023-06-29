package org.Com.QA;

public class sumAllNumInString {

    public static void main(String[] args) {

            String str = "ewr33few34tr34tw";
            int sum=0;

            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);

                if(ch>=48 && ch<=58){
                    sum+=Integer.parseInt(String.valueOf(ch));

                }
            }
            System.out.println("The Sum of Numbers  is :: "+sum);
        }
    }
 