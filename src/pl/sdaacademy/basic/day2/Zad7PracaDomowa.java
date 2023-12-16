package pl.sdaacademy.basic.day2;

public class Zad7PracaDomowa {

    /*Napisz program, który pobierze od użytkownika tekst (typu String) i policzy jakim procentem
wszystkich znaków tekstu był znak spacji.*/

    public static void main(String[] args) {
        System.out.println(spacePercentage("ala ma kota"));
    }
    private static double spacePercentage(String input) {
        char space =' ';
        int counter = 0;
        if (StringValidator.isValid(input)) {

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == space) {
                    counter++;

                }
            }

        }
        return ((double)counter/input.length())*100;
    }
}

