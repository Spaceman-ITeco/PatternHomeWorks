package com.company;

import java.util.Scanner;

public class LessonFirstUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int shoot;
        int a = 0;
        int b = 9;
        while (true) {
            if (sc.hasNextInt()) {
                shoot = sc.nextInt();
                if (shoot < a || shoot > b) {
                    System.out.println("Вы ввели неверное число для выстрела." + "\n"
                            + "Введите число от " + a + " до " + b + " для выстрела.");
                    continue;
                }
              break;
            }
        }
    }
}
