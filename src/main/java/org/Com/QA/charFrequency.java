package org.Com.QA;

import org.junit.Test;

import java.util.*;

public class charFrequency {

    public static void main(String[] args) {

        usingForLoop("Bharath v is automation engineer");
//        usingCollectionMap("Bharath v is automation engineer");
    }

    public static void usingForLoop(String str) {

        char[] chr = str.toCharArray();
        int[] freq = new int[chr.length];
        for (int i = 0; i < chr.length; i++) {
            for (int j = i + 1; j < chr.length; j++) {
                if (chr[i] == chr[j]) {
                    freq[i]++;
                    chr[j] = '0';
                }
            }
        }
        for (int k = 0; k < freq.length; k++) {
            if (chr[k] != ' ' && chr[k] != '0') {
                System.out.println(chr[k] + ":" + freq[k]);
            }
        }
    }

    public static void usingCollectionMap(String str) {

        char chr[] = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println("To find the Frequency using Collection");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
    static int a=100;

    @Test
    public void duplicatesInHashMap() {
        Map<String, String> map = new HashMap<>();
        Map<String, Integer> data = new HashMap<>();

         List<String> lst=new ArrayList<>();
        map.put("Bharath V", "q1");
        map.put("pavi V", "q2");
        map.put("srik V", "q4");
        map.put("giri V", "q1");
        map.put("umesh V", "q1");
        for (Map.Entry entry:map.entrySet()) {
            lst.add((String) entry.getValue());
        }

        for(String i:lst){
            if(data.containsKey(i)){
                data.put(i, data.get(i)+1);
            }else{
                data.put(i, 1);
            }
        }
        System.out.println(data);
        a=200;
        System.out.println(a);
        a=300;
        System.out.println(a);
        System.out.println(charFrequency.a);
    }


}


