package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valueMatches = 11;
        System.out.println("Добро пожаловать!");
        System.out.println("Вам необходимо вытаскивать от 1 до 3 спичек!Кто вытащит последние две - тот победил!");
        System.out.println("Начинаем");
        while (valueMatches > 0) {
            System.out.println("Ходит следующий");
            int select = Integer.valueOf(scanner.nextLine());
            if (select >= 1 && select <= 3 && select <= valueMatches) {
                valueMatches = valueMatches - select;
                System.out.println("Осталось " + valueMatches + " спичек.");
            } else {
                System.out.println("Введите правильное число, от 1 до 3, пожалуйста!!!");
            }
        }
        System.out.println("Это были последние спички. Вы победили!!!");
    }
}
