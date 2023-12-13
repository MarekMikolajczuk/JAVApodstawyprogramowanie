package pl.sdaacademy.basic.day2;

public class Zad1 {


    public static void main(String[] args) {

        String input = "ala";
        char result = getLastCharacter(input);
        System.out.println(result);
    }


    private static char getLastCharacter(String input) {
        return input.charAt(input.length() - 1);
    }
}
