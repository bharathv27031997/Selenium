package org.Com.QA;

public class Overloading {


    public double area(int length, int height){
        return 0.5 * length * height;

    }

    public int area(int radius){
        //area of circle = 22/7 * r*r
        return 22/7 * radius * radius;
    }
}
