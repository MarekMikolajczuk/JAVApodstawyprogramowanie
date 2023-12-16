package pl.sdaacademy.basic.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad1 {
    public static void main(String[] args) {


        System.out.println(isCOrrectEmailFormat("sda@com"));
        System.out.println(isCOrrectEmailFormat("sda1@com"));
        System.out.println(isCOrrectEmailFormat("sda@.com"));
        System.out.println(isCOrrectEmailFormat("sda@com2.pl"));
        System.out.println(isCOrrectEmailFormat("sda@com.pl.com1"));

    }


    private static boolean isCOrrectEmailFormat(String email) {

        Pattern pattern = Pattern.compile("[A-Za-z0-9]+@[a-z]+(.[a-z]+)*");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();

    }


}
