package org.example;

import java.util.Scanner;

/*
Napisz program, który wypisze poniższy kawałek tabliczki mnożenia:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
* Zmodyfikuj metodę, tak aby wyświetlała powyższy kawałek tabliczki mnożenia dla zadanego
mnożnika i mnożnej (dwa parametry: od - do) zadanych jako parametry.
Przykład:
void printMultiplicationTable(int multiplier,int minMultiplicand, int maxMultiplicand)
multiplier = 6, multiplicandMin = 2, multiplicandMax = 5
 */
public class Task_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaką liczbę chcesz mnożyć: ");
        int multiplier = scanner.nextInt();
        System.out.println("Parametr startowy: ");
        int multiplicandMin = scanner.nextInt();
        System.out.println("Parametr końcowy: ");
        int multiplicandMax = scanner.nextInt();
        for (int i = multiplicandMin; i <= multiplicandMax; i++){
            multiplicandMin += i;
            int sum = i * multiplier;
            System.out.println(multiplier + " * " + i + " = " + sum);
        }
    }
}
