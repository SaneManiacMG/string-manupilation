package com.company;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static sun.misc.Version.println;

public class Main {

    public static void main(String[] args) {
        //String myString = "Jack + Jill + Steve + Joll";
        String river = "MississippiMississippiMississippi";
        String riverPart = river.substring(4, 8);

        Pattern p = Pattern.compile("Mi(.*?)pi");
        Matcher m = p.matcher(river);

        while (m.find()) {
            System.out.println(m.group(1));
        }

        String[] splitThis = river.split("s");
        //String[] splitString = myString.split(" + ");

        System.out.println(Arrays.toString(splitThis));
        System.out.println(Arrays.toString(new String[]{riverPart}));
    }
}
