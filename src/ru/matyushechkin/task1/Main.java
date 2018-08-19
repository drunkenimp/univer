package ru.matyushechkin.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Укажите кол-во литров бензина: ");
        int fuel_price = 45;                                         // цена бензина за один лирт, в рублях ;)
        Scanner scanner = new Scanner (System.in);                   // создание объекта Сканнер
        int fuel_in = scanner.nextInt();                             // переменная кол-во литров, вводит пользователь
        if (fuel_in >= 0) {                                          // проверка на корректность введеного числа
            int fuel_result = fuel_in * fuel_price;                  // расчет стоимости
            System.out.println("Общая стоимость бензина составит:"   // вывод стоимоти на экран
                    + " " + fuel_result + " " + "рублей");
        } else {
            System.out.println("Неккоректное число!");               // вывод ошибки ввода
        }

    }
}
