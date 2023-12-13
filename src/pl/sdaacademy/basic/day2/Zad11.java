package pl.sdaacademy.basic.day2;

import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        String input = "java";
        boolean result = isPalindrome(input);
        System.out.println(result);

        input = "kajak";
        result = isPalindrome(input);
        System.out.println(result);

        /*
        Person person = new Person("Paweł", "Dudko");
        Person person2 = new Person("Paweł", "Dudko");
        person == person2 -> false -> porownuje lokalizacje w pamieci
        person.equals(person2) -> true -> porównuje obiekty ale jako wartosci
        */
    }

    private static boolean isPalindrome(String input) {
        if(StringValidator.isValid(input)) {
            //StringBuilder sb = new StringBuilder(input).reverse();
            //String reversedInput = sb.toString();
            String reversedInput = new StringBuilder(input).reverse().toString();
            return input.equals(reversedInput);
        }
        return false;
    }
}
