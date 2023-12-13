package pl.sdaacademy.basic.day2;

public class Zad3 {
//Napisz program, który przyjmie jako parametry input oraz word (oba typu String), a następnie
//sprawdzi czy word występuje w input. Jeżeli tak, wtedy wynikiem jest pozycja na której zaczyna
//się word. Jeżeli nie udało się znaleźć szukanego tekstu wtedy wynikiem powinno być -1.


    public static void main(String[] args) {
        String inpput = "Ala ma kota";
        String word = "psa";
        int result = getIndex(inpput,word);
        System.out.println(result);

    }

    private static int getIndex(String input, String word) {

        if (StringValidator.isValid(input) && StringValidator.isValid(word)) {
            if (input.contains(word)) {
                return input.indexOf(word);
            }
        }

        return -1;
    }
}