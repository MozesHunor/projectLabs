package org.fasttrackit.lab3;

import java.util.ArrayList;

public class LabFour {

    //11. Se se calculeze suma primelor n numere naturale, unde n este declarat ca si
    //int n = 20; //sau o alta valoare
    public void firstNSum(int n) {

        if (n >= 0) {
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                sum += i;
            }
            System.out.println("The sum of first " + n + " numbers is: " + sum);
        } else {
            int sum = 0;
            for (int i = 0; i >= n; i--) {
                sum += i;
            }
            System.out.println("The sum of first " + n + " numbers is: " + sum);
        }
    }

    //13. se da un numar . se se afiseze true daca numrul apartine intervalului [9,24] , altfel sa se afiseze true.
    public void checkArray(int n) {

        if ((n >= 9) && (n <= 24)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    //14. se dau doua numere a si n. sa se afiseze numarul a la puterea n
    public void power(double a, double power) {

        System.out.println(a + " on the power of " + power + " is: " + Math.pow(a, power));
    }

    //15. Sa se calculeze factorialul unui numar a .
    public void factorial(int n) {

        if (n < 1) {
            System.out.println("The number has to be higher than 0 !");
        } else {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("The factorial of " + n + " is: " + fact);
        }

    }

    //16. Se da un sir de numere. Sa se afiseze perechile de numere pentru care  primul numar este mai mare decat al doilea.
    public void pairFinder(int[] array) {

        for (int i = 0; i < array.length; i += 2) {
            if (array[i] > array[i + 1]) {
                System.out.println("{" + array[i] + ", " + array[i + 1] + "}");
            }
        }
    }

    //17. Se da un numar intreg x si un numar intreg n. Sa se calculeze urmatoarea suma:
    //suma = 1+x+x la puterea 2 + x la puterea 3 + ….+ x la puterea n .
    public void sum(int n, int pwr) {

        int sum = 0;
        for (int i = 0; i <= pwr; i++) {
            sum += Math.pow(n, i);
        }
        System.out.println(sum);
    }

    //20. Se da un sir. Sa se extraga toate numerele intre doua valori si sa se puna intr-un alt sir care apoi sa se afiseze.
    public void newArray(int min, int max) {

        int[] oldArray = {11, 13, 55, 66, 77, 123, 43, 23, 54, 67, 89, 26, 72};
        ArrayList<Integer> newArray = new ArrayList<Integer>();

        for (int i = 0; i < oldArray.length; i++) {
            if ((oldArray[i] < max) && (oldArray[i] > min)) {
                newArray.add(oldArray[i]);
            }
        }
        System.out.println(newArray.toString());
    }

}
