package pl.sdaacademy.basic.day1;

    public class Zad1 {
        /*Napisz program, który wyświetli na ekranie wyraz SDA, nie używając ani jednego znaku " lub '.
         */

        public static void main(String[] args) {

//decimal
            displayDecimal();


//hex

            char s1 = 0x53;
            char s2 = 0x44;
            char s3 = 0x41;

            System.out.print(s1);
            System.out.print(s2);
            System.out.print(s3);

            // binary
            //01010011  01000100 01000010

            char s4=0b01010011;
            char s5=0b01000100;
            char s6=0b01000010;
        }

        private static void displayDecimal() {
            char s = 83;
            char d = 68;
            char a = 65;


            System.out.print(s);
            System.out.print(d);
            System.out.print(a);
        }

    }


