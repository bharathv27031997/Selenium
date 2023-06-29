package org.Com.QA;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listDemo {

    @Test
    public void arrayList() {
        List<String> lst = new ArrayList<>();
        List<String> lst1 = new ArrayList<>();
        lst.add("Bangalore");
        lst.add("pune");
        lst.add("chennai");
        lst.add("delhi");
        lst.add("mumbai");
        lst.add("kolkatha");
        lst1.add("pune");
        lst1.add("chennai");
        lst1.add("delhi");

        lst.removeAll(lst1);
        System.out.println("List 1::" + lst);
        System.out.println("List 2::" + lst1);


    }

    @Test
    public void vectorList() {

        //        vector is synchronised
        //        Vector is thread safe
        //        No difference between vector and array list

        List<String> lst = new ArrayList<>();
        List<String> lst1 = new ArrayList<>();
        lst.add("Bangalore");
        lst.add("pune");
        lst.add("chennai");
        lst.add("delhi");
        lst.add("mumbai");
        lst.add("kolkatha");
        lst1.add("pune");
        lst1.add("chennai");
        lst1.add("delhi");
    }

    @Test
    public void arrayListAssinement() {

        List<String> lst = new ArrayList<>();
        lst.add("bangalore");
        lst.add("pune");
        lst.add("chennai");
        lst.add("delhi");
        lst.add("mumbai");
        lst.add("hyderabad");

        convertFirstAndLastCaps(lst);
        allVowelInCaps(lst);
        arrayListInReverse(lst);

        List<Integer> intList = new ArrayList<>();
        intList.add(18);
        intList.add(11);
        intList.add(15);
        intList.add(13);
        intList.add(17);
        intList.add(199);
        intList.add(1888);
        intList.add(1088);
        intList.add(1045);
        intList.add(1111);

        arrayListCheckPrimeNumber(intList);
     }

    public void convertFirstAndLastCaps(List<String> lst) {
        ArrayList<String> newList = new ArrayList<>();

        for (int i = 0; i < lst.size(); i++) {
            String str = lst.get(i);
            int size = str.length();

            String last = str.substring(size - 1, size);
            String lastChar = last.toUpperCase();

            String middleChar = str.substring(1, size - 1);

            String first = str.substring(0, 1);
            String firstChar = first.toUpperCase();
            newList.add(firstChar + middleChar + lastChar);
        }
        System.out.println("The upperCase of First and Last Letter is :: " + newList);
    }

    public void allVowelInCaps(List<String> lst) {

        //  Store 10 strings in an arraylist and print all by converting all vowels in caps.
        ArrayList<String> newList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        String str;
        for (int i = 0; i < lst.size(); i++) {
            str = lst.get(i);

            String newString = null;
            for (int j = 0; j < str.length(); j++) {
                char oldChar = str.charAt(j);
                char newChar;

                if (oldChar == 'a' || oldChar == 'e' || oldChar == 'i' || oldChar == 'o' || oldChar == 'u') {
                    newChar = Character.toUpperCase(oldChar);
                } else {
                    newChar = oldChar;
                }
                if (newChar == oldChar) {
                    sb.append(oldChar);
                } else {
                    newString = str.replace(oldChar, newChar);
                    sb.append(newString.charAt(j));
                }
            }
            newList.add(String.valueOf(sb));
            sb.delete(0, str.length());
        }
        System.out.println("The upperCase of Vowels is :: " + newList);
    }

    public void arrayListInReverse(List<String> lst) {

        // Store 10 strings in an arraylist and print all by converting each element in reverse.
        ArrayList<String> newList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        String str;
        String rev = "";
        for (int i = 0; i < lst.size(); i++) {
            str = lst.get(i)+" ";
            for (int j = str.length() - 1; j >= 0; j--) {
                rev = rev + str.charAt(j);
            }
            newList.add(rev);
            rev="";
        }
        String sbList = lst.stream().map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining(" "));
        System.out.println("The reversed Using Stream Function is :: "+sbList);
         System.out.println("The reversed Using For Function is :: " + newList);
    }

     public void arrayListCheckPrimeNumber(List<Integer> lst) {

        // Store 10 integers in an arraylist and print all prime elements olny.
        ArrayList<Integer> newList = new ArrayList<>();
        int num;
        int primeNum;
        boolean isPrime = false;
        for (int i = 0; i < lst.size(); i++) {
            num = lst.get(i);
            for (int j = 2; j < num / 2; j++) {
                primeNum = num % j;
                if (primeNum == 0) {
                    newList.add(num);
                    break;
                }
            }
        }
        System.out.println("The Prime Number in ArrayList is ::" + newList);
    }
}

