package org.example;

import java.util.Scanner;

/*
Napisz program obliczający BMI (Body Mass Index) oraz sprawdzający, czy jest ono w normie.
Program powinien wczytać od użytkownika dwie zmienne: wagę (weight) w kilogramach (typ
float) oraz wzrost (height) w centymetrach (typ int).
Optymalny zakres BMI wynosi od 18,5 do 24,9, wartości mniejsze lub większe są wartościami
nieoptymalnymi. Twój program powinien wypisać „BMI is correct” lub „BMI is not correct”,
zgodnie z powyższymi założeniami.
Przykład:
Please insert weight in kg: 80
Please insert height in cm: 185
BMI is correct: 23.37472
 */
public class Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź swoją wagę: ");
        float weight = scanner.nextFloat();
        System.out.println("Wprowadź swój wzrost w cm: ");
        int height = scanner.nextInt();
        double m = (double) height / 100;
        double p2 = m * m;
        double result = weight / p2;
        System.out.println("Twoje BMI wynosi: " + result);
        if (result <= 18.49 || result >= 24.50){
            System.out.println("BMI is not correct");
        }
        if (result >=18.50 && result <=24.90 ){
            System.out.println("BMI is correct");
        }
    }
}
