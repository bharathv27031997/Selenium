package org.Interview_Questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class advanceLoopForList {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(100);
        lst.add(200);
        lst.add(300);
        lst.add(400);

        Iterator<Integer> itr=lst.listIterator();
        while(itr.hasNext()){
            System.out.println("Using WhileLoop"+ itr);
        }

        for(int i:lst){
            System.out.println("Using Advanvce Foor Loop"+i);

        }
    }
}
