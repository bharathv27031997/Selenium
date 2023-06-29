package org.Com.QA;

public class simpleThread extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("bharath v");
    }

    public static void main(String[] args) {
        simpleThread st=new simpleThread();
        st.start();
    }
 }
