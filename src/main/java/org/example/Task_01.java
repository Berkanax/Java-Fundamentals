package org.example;

/*
Napisz program, który wyświetli na ekranie wyraz SDA, nie używając ani jednego znaku " lub '.
 */
public class Task_01 {
    public static void main(String[] args) {
        System.out.print((char) 83);
        System.out.print((char) 68);
        System.out.println((char) 65);

        /*
        Ewentualne dodatkowe rozwiązanie
         */

        char S = 83;
        char D = 68;
        char A = 65;
        System.out.println(String.valueOf(S) + D+ A);

    }
}
