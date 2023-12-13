package pl.sdaacademy.basic.day1;

public class Zad8 {

    //Napisz program, który dla zadanego zakresu od 0 do X, wyświetli tylko liczby pierwsze.


    public static void main(String[] args) {
        int rangeFrom = 0;
        int rangeTo = 10;
        for(int i = rangeFrom; i <= rangeTo; i++) {
            if(isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrimeNumber(int number) {
        /*
        number = 5
        5/2
        5/3
        5/4

        number = 7
        7/2
        7/3
        7/4
        7/5
        7/6

        number = 9
        9/2
        9/3 -> false

        number = 97 / 2 = 48,5 -> 48
        2-96 -> 94 operacje
        97/60
        97/75
        97/90
         */
        if(number < 2) {
            return false;
        }
        for(int i = 2; i <= number/2; i++) {
            if(number%i == 0) {
                return false;
            }
        }
        return true;
    }
}