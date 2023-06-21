package org.Interview_Questions;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NoCharInSentence {
    public static void main(String[] args) {
       char[] str= "What What What understand by software testi".toCharArray();
        HashMap<Character, Integer> map=new HashMap<>();
        for(char s:str){
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }else{
                map.put(s, 1);
            }
        }
        System.out.println(map);
    }

    @Test
    public void advanceLoop(){
        HashMap<Integer, String> map=new HashMap<>();
        map.put(1, "Bharath V");
        map.put(2, "venkatesh V");
        map.put(3, "pavithra V");
        map.put(4, "bhagyamma V");

        Iterator itr=map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry me =(Map.Entry)itr.next();
            System.out.println("The Key is ::"+me.getKey()+" The Value is ::"+me.getValue());

         }

        for(Map.Entry entry:map.entrySet()){
            System.out.println("Using for Loop ::"+ entry);
        }

    }
}
