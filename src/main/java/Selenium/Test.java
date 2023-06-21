package Selenium;

public class Test {

//    string asinput = "Interview with Automation";
//    String output = "no

    public static void main(String[] args) {
       String input=  "Interview with Automation";
        System.out.println(input);
        String rev="";
        StringBuffer sb=new StringBuffer();
        for (int i = input.length()-1; i >0 ; i--) {
             rev=rev + input.charAt(i);

        }
        System.out.println(rev);


            }


        }



