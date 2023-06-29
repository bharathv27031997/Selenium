package org.Com.QA;

import org.junit.Test;

import java.util.*;

public class swapTwoStrings {

    public static void main(String[] args) {

        String fir = "one";
        String sec = "two";
        fir = fir + sec;
        sec = fir.substring(0, fir.length() - sec.length());
        fir = fir.substring(sec.length());
    }
}