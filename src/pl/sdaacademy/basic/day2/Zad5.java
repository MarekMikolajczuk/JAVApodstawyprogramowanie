package pl.sdaacademy.basic.day2;

public class Zad5 {

    /*Napisz program, który przyjmie jako argument input (typu String) i znak (typu char), a następnie
zwróci liczbę wystąpień podanego znaku w danym łańcuchu znaków.
Przykład:
Input: Ala ma kota
Searched Character: a
Result: 3*/

    public static void main(String[] args) {
        String word = "abrakadabra";
        int result = charCounter(word, 'a');
        System.out.println(result);
    }


    private static int charCounter(String input, char letter) {
        int counter = 0;
        if (StringValidator.isValid(input)) {

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == letter) {
                    counter++;

                }
            }

        }
        return counter;
    }
}
