package org.Com.QA;

public class permutationsOfAtring {

    public static String swaoNum(String str, int i, int j) {
        char[] charayy = str.toCharArray();
        char temp = charayy[i];
        charayy[i] = charayy[j];
        charayy[j] = temp;
        return String.valueOf(charayy);

    }

    public static void backTrace(String s, int id, int n) {
        if (id == n) {
            System.out.println(s);
        } else {
            for (int i = id; i <= n; i++) {

                swaoNum(s, id, i);
                backTrace(s, id + 1, n);
                swaoNum(s, id, i);
            }
        }
    }

    public static void main(String[] args) {
        backTrace("abc", 0, "abc".length()-1);
    }
}
