package org.Com.QA;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicCharInString {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] str = "aaaaaadddd V".toCharArray();
        for (char c : str) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(" The Duplicate Character is ::" + entry.getKey() + " : " + entry.getValue());
            }
        }

        Arrays.asList(10, 20, 30).stream().sorted().max(Integer::compareTo);
    }
}
