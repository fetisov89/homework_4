package ru.skypro;

public class Main {
    public static void main(String[] args) {

//        Example 1

//        int number = 0;
//        while (number != 10){
//            number++;
//            System.out.print(number + " ");
//        }
//        System.out.println("");
//        System.out.println("");
//        number = 10;
//        for (; number > 0;) {
//            System.out.print(number + " ");
//            number--;
//        }
//
//        Example 2
//
//        int number = 6;
//        int monthDay = 0;
//        for (; number < 31;) {
//            if (number == 6){
//                System.out.println("Segodnya pyatnica, " + number + " chislo, pora sdat otchet");
//            }
//            number += 7;
//            System.out.println("Segodnya pyatnica, " + number + " chislo, pora sdat otchet");
//            }

//        Example 3

        int currentYear = 2022;
        int periodComet = 79;
        for (int i = 0; i < currentYear; i++) {
            if (i % periodComet == 0 && i > 1822){
                System.out.println(i);
            }
        }

    }
}
