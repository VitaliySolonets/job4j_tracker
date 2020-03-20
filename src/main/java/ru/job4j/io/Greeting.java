package ru.job4j.io;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать! Как вас зовут?");
        String name = scanner.nextLine();
        System.out.println(name + " ,рад вас видеть!");
    }
}
