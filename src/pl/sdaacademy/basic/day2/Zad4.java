package pl.sdaacademy.basic.day2;

public class Zad4 {

    //Napisz program, który odczytuje wprowadzony przez użytkownika tekst, a następnie dla tego
    //tekstu zamienia wszystkie wystąpienia przecinków i kropek na tekst “-STOP-”, a następnie
    //wyświetla wynik w konsoli
    private static final String REPLACEMENT = "-STOP-";
    private static final String REGEX = "[.,]";

    public static void main(String[] args) {
        String input = "Ala ma, kota. a kot, ma Ale";
        String result = replaceInput(input);
        System.out.println(result);

        input = "fdsfsdfsd fsdfsdf";
        result = replaceInput(input);
        System.out.println(result);
    }

    private static String replaceInput(String input) {
        if(StringValidator.isValid(input)) {
//            return input
//                    .replace(".", REPLACEMENT)
//                    .replace(",", REPLACEMENT);
            return input.replaceAll(REGEX, REPLACEMENT);
        }
        return input;
    }

}






