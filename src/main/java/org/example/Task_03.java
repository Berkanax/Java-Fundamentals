package org.example;

import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika dwie zmienne x i y (typu int). Następnie za pomocą operatorów logicznych i matematycznych wyświetl wynik następujących zadań:
a) Czy x jest większe od y?
b) Czy x pomnożone przez 3 jest większe od y?
c) Czy y++ jest mniejsze od ++x i jednocześnie --x jest mniejsze od y++?
d) Czy iloczyn liczb x i y jest parzysty?

Przykład:
Please insert first digit: 2
Please insert second digit: 4
If x is greater than y: false
If x * 3 is greater than y: true
If y++ is smaller than ++x and --x is smaller than y++: false
If x * y is even: true
 */
public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź zmieną x: ");
        int originalX = scanner.nextInt();

        System.out.println("Wprowadź zmieną y: ");
        int originalY = scanner.nextInt();

        System.out.println("Dane przyjęte.");

        // Test 1
        int x = originalX;
        int y = originalY;
        System.out.println("If x is greater than y: " + (x > y));

        // Test 2
        x = originalX;
        y = originalY;
        System.out.println("If x * 3 is greater than y: " + (x * 3 > y));

        // Test 3
        x = originalX;
        y = originalY;
        System.out.println("If y++ is smaller than ++x and --x is smaller than y++: " + (y++ < ++x && --x < y++));

        // Test 4
        x = originalX;
        y = originalY;
        System.out.println("Czy iloczyn liczb x i y jest parzysty: " + (x * y % 2 == 0));
    }
}



