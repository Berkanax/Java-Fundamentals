package org.example;

import java.util.Scanner;

/*
Napisz program, który dla zadanych parametrów firstDigit i secondDigit (oba typu int), obliczy
sumę liczb od firstDigit do secondDigit.
Przykład:
Please insert first digit: 4
Please insert second digit: 11
Sum: 60

Zadanie polega na obliczeniu sumy liczb od firstDigit do secondDigit. To znaczy, że jeśli firstDigit wynosi 4, a secondDigit wynosi 11,
to chcemy dodać do siebie wszystkie liczby od 4 do 11, czyli 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11. Wynik tej sumy to 60.
 */
public class Task_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź First Digit: ");
        int firstDigit = scanner.nextInt();
        System.out.println("Wprowadź Second Digit: ");
        int secondDigit = scanner.nextInt();
        int sum = 0;
        for (int i = firstDigit; i <= secondDigit; i++) {
        sum += i;
        }
        System.out.println("Suma: " + sum);
    }
}