package lesson0202;

import java.util.Scanner;

public class Lesson0202 {
    public static void main(String[] args) {
        int n=0 ; // количество чисел
        int[] a;
        int chet=0;
        int sumofmodule3=0;
        int modulelessthen3=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Сколько чисел будем вводить?");
        if (sc.hasNextInt()) {

            n = sc.nextInt();
        }
         a = new int[n];
        System.out.println("Сколько чисел будем вводить?");

        for (int i = 0; i < n; i++) {

            if (sc.hasNextInt()) a[i] = sc.nextInt();
            if((a[i]%2) == 0) {
               chet++;
            }
            if(a[i]%3==0){
                sumofmodule3+=a[i];

            }

           if((Math.abs(a[i]))<3){
               modulelessthen3++;
           }
        }

        System.out.println("Количество четных " + chet);
        System.out.println("Кратность чисел" + " " + sumofmodule3);
        System.out.println("Количество модулей меньше трез " + modulelessthen3);

    }
}
