package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika średnicę okręgu (typu float), a następnie obliczy
obwód oraz pole tego okręgu. Do obliczeń przyjmij:
a) π = 3,14;
b) wartość stałej π z klasy Math.
Przykład:
Please insert diameter: 2,5
Circumference Of A Circle: 7.8500004
Area Of A Circle: 4.90625
 */

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj średnice okręgu: ");
        float diameter = scanner.nextFloat();
        double Circumference = Math.PI * diameter;
        System.out.println("Circumference Of A Circle: " + Circumference);
        double radius = diameter /2;
        double Area = Math.PI * (radius * radius);
        System.out.println("Area Of A Circle: " + Area);
    }
}
