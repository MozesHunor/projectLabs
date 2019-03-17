package org.fasttrackit.lab3;

import java.util.Scanner;

public class MediaAritmetica {

    //1.	Sa se calculeze medie aritmetica a doua numere pozitive citite de la tastatura.
    public void mediaAritmetica() {

        Scanner userInput = new Scanner(System.in);
        double a, b, avg;
        System.out.println("Enter first number: ");
        a = userInput.nextInt();
        System.out.println("Enter second number:");
        b = userInput.nextInt();
        avg = (a + b) / 2;
        System.out.println("The avg of the two numbers is: " + avg);

    }

    //2.	Sa se calculeze media aritmetica a N numere pozitive citite de la tastatura.
    public void mediaAritmeticaN() {

        double nb, avg;
        double sum = 0;
        int array = 0;
        Scanner userInput = new Scanner(System.in);

        while (array <= 0) {
            System.out.println("Enter the length of the array (higher than 0): ");
            array = userInput.nextInt();
        }

        for (int i = 0; i < array; i++) {
            System.out.println("Enter a number for the array: ");
            nb = userInput.nextInt();
            sum = sum + nb;
        }

        avg = sum / array;
        System.out.println("The avg of " + array + " numbers is: " + avg);

    }

    //3.	Sa se determine maximul a N numere citite de la tastatura.
    public void maxNumber() {

        int array = 0;
        int maxNumber = 0;
        Scanner userInput = new Scanner(System.in);

        while (array <= 0) {
            System.out.println("Enter the length of the array (higher than 0): ");
            array = userInput.nextInt();
        }

        System.out.println("Enter a number for the array: ");
        int nb = userInput.nextInt();
        maxNumber = nb;

        for (int i = 1; i < array; i++) {
            System.out.println("Enter a number for the array: ");
            nb = userInput.nextInt();
            if (nb >= maxNumber) {
                maxNumber = nb;
            }
        }

        System.out.println("The biggest number from your inputs is: " + maxNumber);
    }

    //4.	Sa se genereze o tabla a inmultirii cu N, unde N este citit de la tastatura, de ex tabla inmultirii cu 5
    public void tablaInmultiriiN() {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number for multiplication: ");
        int multiplier = userInput.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(multiplier + " X " + i + " = " + (multiplier * i));
        }
    }

    //5.	Sa se genereze o tabla a inmulturii intre N si M, unde N si M sunt citite de la tastatura.
    public void tablaInmultiriiNM() {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a starting number for multiplication: ");
        int min = userInput.nextInt();

        System.out.println("Enter an end number for multiplication: ");
        int max = userInput.nextInt();

        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }

        for (int i = min; i <= max; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
                if (j == 9) {
                    System.out.println("==========");
                }
            }
        }
    }

    //Se da un numar natural a, de exemplu  int a = 64321
    public void numberActions() {

        int sum = 0;
        int product = 1;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = userInput.nextInt();
        int number = a;
        int count = 0;

        //a) Sa se calculeze suma cifrelor numarului cat si produsul lor
        //b) sa se precizeze cate cifre are numarul citit
        while (a > 0) {
            sum = sum + (a % 10);
            product = product * (a % 10);
            a = a / 10;
            count++;
        }
        System.out.println("The sum of the numbers of " + number + " is: " + sum);
        System.out.println("The result of multiplication of the numbers of " + number + " is: " + product);
        System.out.println("It has " + count + " numbers.");
    }

    //7. Se da un numar a. Se se afiseze numarul invers
    public void inverse() {

        int inv = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = userInput.nextInt();

        while (a > 0) {
            inv = inv * 10 + a % 10;
            a = a / 10;
        }

        System.out.println(" -> " + inv);
    }

    //8. Se da un numar a. Sa se determine daca numarul este palindrom ori nu.
    public void palindrome() {

        int inv = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = userInput.nextInt();
        int number = a;

        while (a > 0) {
            inv = inv * 10 + a % 10;
            a = a / 10;
        }

        if (number == inv) {
            System.out.println("The number " + number + " is a palindrome -> " + inv);
        } else {
            System.out.println("The number " + number + " is not a palindrome -> " + inv);
        }

    }

    //9. Se da un numar a.
    //Se se afiseze un numar b format doar din numerele impare ale numarului a, si un numar c format din patratul numerelor pare ale numarului a.
    public void formatNumber() {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = userInput.nextInt();
        int number = a;
        int odd = 0;
        int even = 0;

        while (a > 0) {
            if (a % 2 != 0) {
                odd = odd * 10 + a % 10;
            } else {
                even = even * 10 + ((a % 10) * (a % 10));
            }
            a = a / 10;
        }

        System.out.println("Your number was: " + number + "\n Odd numbers are: " + odd + "\n Even numbers with the power of two: " + even);
    }

    //10. Se da un sir de numere ordonate crescator.
    //Se va determina daca un numar n exista in sir, si daca exista se va afisa pozitia pe care s-a gasit, altfel se va afisa -1.
    public void searchArray(int search) {

        int[] array = {11, 12, 13, 14, 15, 22, 33, 44, 55};
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                System.out.println("The number " + search + " is on position " + i);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("-1");
        }
    }
}
