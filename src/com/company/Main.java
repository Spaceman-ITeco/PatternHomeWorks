package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int shoot;
        while (true) {
            if (sc.hasNextInt()) {
                shoot = sc.nextInt();
                if (shoot < 0 || shoot > 9) {
                    System.out.println("Вы ввели неверное число для выстрела.");
                    System.out.println("Введите число от 0 до 9 для выстрела.");
                    continue;
                }
                break;
            } else {
                String temp = sc.nextLine();
                System.out.println("Вы ввели неверное число для выстрела.");
                System.out.println("Введите число от 0 до 9 для выстрела.");
            }
        }
    }
}
