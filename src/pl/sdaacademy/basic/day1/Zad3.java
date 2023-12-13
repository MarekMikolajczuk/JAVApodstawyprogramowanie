package pl.sdaacademy.basic.day1;

import java.util.Scanner;

public class Zad3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Podaj liczbę X: ");

        int x = scanner.nextInt();
        System.out.println(" Podaj liczbę Y: ");
        int y = scanner.nextInt();
        isXgretaterThanY(x,y);
    }

    private static void isXgretaterThanY(int x,int y) {

        boolean xGreaterY = x > y;
        System.out.println("czy x jest większe od y: "+ xGreaterY);
    }

    private static void isXmulitolyBy3gretaterThanY(int x,int y) {

        boolean xmultipliedGreaterY = (x*3) > y;
        System.out.println(" Czy X*2 jest większe od Y" + xmultipliedGreaterY);

    }
    private static void punnkt39(int x, int y){

        boolean wynik = (y++ < ++x) && (--x > y++);
        System.out.println(wynik);
    }

}


