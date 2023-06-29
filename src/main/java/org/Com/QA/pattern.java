package org.Com.QA;

import org.junit.Test;

public class pattern {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }

    @Test
    public  void number_Print() {

        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >=0; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    @Test
    public  void number_Pattern() {

        //        1
        //        1 2
        //        1 2 3
        //        1 2 3 4
        //        1 2 3 4 5


        for(int i=0;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
