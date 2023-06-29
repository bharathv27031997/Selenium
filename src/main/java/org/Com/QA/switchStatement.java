package org.Com.QA;

import org.junit.Test;

public class switchStatement {

    @Test
    public void switch_Statement(){

        int a=10, b=20;
        String s="+";
        switch(s){
            case "+":{
                System.out.println(a+b);
            }
            case "-":{
                System.out.println(a-b);
            }
            case "*":{
                System.out.println(a*b);
            }
            case "/":{
                System.out.println(a/b);
            }
        }

    }
}
