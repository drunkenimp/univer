package ru.matyushechkin.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Укажите зарплату без учета НДФЛ: ");
        float nalog = 0.87f;                                        // НДФЛ
        Scanner scanner = new Scanner (System.in);                  // создание объекта Сканнер
        int z_p_dirty = scanner.nextInt();                          // переменная зарплата грязными, вводит пользователь
        int z_p_clear = (int)(z_p_dirty * nalog);                   // расчет чистой зарплаты
        if (z_p_dirty >= 0) {                                       // проверка на корректность введеного числа
            System.out.println("Чистая зарплата на руки составаит:" // вывод чистой зарплаты на экран
                    + " " + z_p_clear + " " + "рублей");
        } else {
            System.out.println("Неккоректное число!");              // вывод ошибки ввода
        }
    }
}
