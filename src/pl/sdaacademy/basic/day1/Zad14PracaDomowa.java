package pl.sdaacademy.basic.day1;

public class Zad14PracaDomowa {
    /*Napisz program, który na podstawie zmiennych: kwota (double) oraz ilość rat (int), obliczał
będzie miesięczną kwotę raty pożyczki a następnie wypisywał ją w konsoli. Parametry posiadają
pewne ograniczenia, które powinieneś uwzględnić w programie:
a) kwota pożyczki musi mieścić się w przedziale od 100,00zł do 10.000,00zł;
b) liczba rat musi mieścić się w przedziale od 6 do 48;
c) w przypadku wykroczenia kwoty pożyczki poza akceptowalny przedział, kwota pożyczki
powinna być ustawiona na 5.000,00zł. W przypadku podania zbyt małej kwoty, kwota pożyczki
powinna być ustawiona na 1000,00zł.
d) W przypadku wykroczenia ilości rat poza akceptowalny przedział, ilość rat powinna być
ustawiona na 36. W przypadku podania zbyt małej ilości, ilość rat powinna być ustawiona na 18
Obliczona miesięczna rata powinna zawierać również odsetki. Dla uproszczenia przyjmij, że do
kwoty pożyczki doliczasz x procent w zależności od ilości rat:
* 6-12 rat – 2,5%;
* 13-24 rat – 5,0%;
* 25-48 rat – 10,0%;
a następnie obliczasz kwotę raty na podstawie ilości rat*/

    public static void main(String[] args) {
        loan(10000,5);
    }


    private static void loan(double amount, int installments) {

        if (amount < 100) {
            amount = 1000;
            System.out.println("Amount is too small Default value 1000,00 was set");
        } else if (amount > 10000) {
            amount = 5000;
            System.out.println("Amount is too big. Default value 5000,00 was set");
        }

        if (installments < 6) {
            installments = 18;
            System.out.println("Number of installments is too small. Default value 18 was set");
        } else if (installments > 48) {
            installments = 36;
            System.out.println("Number of installments is too big. Default value 36 was set");
        }

        if (installments<=12){
            System.out.printf("Single installment: "+"%3.2f",((double)amount/installments)*1.025 );
        } else if (installments>12&&installments<=24) {
            System.out.printf("Single installment: "+"%3.2f",(double)amount/installments*1.05 );

        } else if (installments>24) {
            System.out.printf("Single installment: "+"%3.2f",(double)amount/installments*1.1 );
        }
    }
}
