package org.Com.QA;

public class RemoveSpaces {

    public static void main(String[] args) {

        String str="my name is bharath V", rev = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=' '){
                rev =rev +str.charAt(i);
            }

        }
        System.out.println(rev);
        System.out.println(str.strip());
        System.out.println(str.replace(" ", ""));
     }
}
