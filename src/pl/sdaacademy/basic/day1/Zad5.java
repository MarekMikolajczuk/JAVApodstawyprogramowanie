package pl.sdaacademy.basic.day1;

/*Napisz program, który dla zadanych parametrów firstDigit i secondDigit (oba typu int), obliczy
sumę liczb od firstDigit do secondDigit*/

public class Zad5 {

    public static void main(String[] args) {
        int firstDigit = 4;
        int secondDigit = 11;

        int sum = sumOfSequence(firstDigit, secondDigit);
        System.out.println(sum);
    }

    private static int sumOfSequence(int firstDigit, int secondDigit) {
        /*
        x = 4
        y = 11
        sum = 4 + 5 + 6 + ... + 11
         */
        int result = 0;
//        for(int i = firstDigit; i <= secondDigit; i++) {
//            result += i;
//        }
//        for(;;){
//
//        }
//        for(; firstDigit <= secondDigit;) {
//            result += firstDigit;
//            firstDigit++;
//        }

//        while(firstDigit <= secondDigit) {
//            result += firstDigit;
//            firstDigit++;
//        }

        do {
            result += firstDigit;
            firstDigit++;
        } while (firstDigit <= secondDigit);

        return result;
    }

}
