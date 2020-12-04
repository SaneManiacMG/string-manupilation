package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //String myString = "Jack + Jill + Steve + Joll";
        String river = "Mississippi";
        String riverPart = river.substring(4, 8);

        String[] splitThis = river.split("s");
        //String[] splitString = myString.split(" + ");

        System.out.println(Arrays.toString(splitThis));
        System.out.println(Arrays.toString(new String[]{riverPart}));
    }
}
