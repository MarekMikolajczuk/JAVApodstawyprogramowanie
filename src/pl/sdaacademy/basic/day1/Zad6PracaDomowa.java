package pl.sdaacademy.basic.day1;

public class Zad6 {

    public static void main(String[] args) {
        printMultiplicationTable(4,10,3);
    }




private static void printMultiplicationTable (int multiplier,int minMultiplicand, int maxMultiplicand) {
        if (minMultiplicand<maxMultiplicand){
        for (int i = multiplier; i <= multiplier; i++) {
            for (int j = minMultiplicand; j <= maxMultiplicand; j++) {
                System.out.println(i + "*" + j + "=" + i * j);

            }
            System.out.println();

        }
    } else System.out.println("pierwsza liczba musi być wyższa niż druga");


}}

