package lesson4;

/**
 * Написать программу, вычисляющую сумму цифр введённого
 * пользователем целого числа.
 */

import java.util.Scanner;

public class Zadacha4_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input int value: ");
        int value = scanner.nextInt();

        System.out.println("Sum: " + sum(value));
    }

    public static int sum(int value) {
        int result = 0;
        value = Math.abs(value);
        while (value != 0) {
            int ostatok = value % 10;
            value = value / 10;
            result += ostatok;
        }

        return result;
    }
}

