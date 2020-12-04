package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String myString = "Jack,Jill,Steve,Joll";

        String[] splitString = myString.split(",");

        System.out.println(Arrays.toString(splitString));
    }
}
