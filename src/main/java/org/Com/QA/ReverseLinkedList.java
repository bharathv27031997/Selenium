package org.Com.QA;

import javax.sound.midi.Soundbank;
import java.util.LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> lst=new LinkedList<>();
        lst.add(100);
        lst.add(-111);
        lst.add(-223);

        lst.descendingIterator().forEachRemaining(System.out::println);
    }
}
