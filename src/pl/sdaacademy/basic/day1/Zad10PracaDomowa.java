package pl.sdaacademy.basic.day1;

public class Zad10PracaDomowa {

    public static void main(String[] args) {
        int a =234;
        String aString = a+"";
        int sum=0;
        for (int i = 0; i <aString.length() ; i++) {

            int val=aString.charAt(i);
            sum+=val;

        }
        System.out.println(sum);

    }
    }




