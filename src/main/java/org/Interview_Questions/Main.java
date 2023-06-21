package org.Interview_Questions;

import org.junit.Test;

import java.util.HashMap;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        char[] str = "Automation".toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char s:str)
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }else{
                map.put(s, 1);
            }

        System.out.println( map.entrySet().stream().filter(x->x.getValue()>1).collect(Collectors.toList()));
    }

    @Test
    public void largestNum(){
        int[] num={0, 29 ,48, 49};
        int max=num[0];
        int min=num[0];
        for(int i=0;i<num.length;i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println("The Min Number ::"+min);
        System.out.println("The Max Number ::"+max);

    }
@Test
    public void testArray(){

        int[] arr={10, 19, 19, 10};
        int[] temp = new int[0];
        int averag=0;
        for(int i=0; i<arr.length;i++){
              averag=averag+arr[i];
        }
        averag=averag/arr.length;
        System.out.println(averag);
        for (int i=0;i<arr.length;i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]!=arr[j]){
                    System.out.println(arr[i]);
                    temp[i]=arr[i];
                }

            }
            for (int k=0;k<temp.length;k++){
                arr[i]=temp[i];
            }
            System.out.println("The removed duplicate Array is ::"+ arr);
        }


    }

}
