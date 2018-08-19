package ru.matyushechkin.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Вводи в секундах узнай в часах: ");
        Scanner scanner = new Scanner (System.in);                          // создание объекта Сканнер
        int sec = scanner.nextInt();                                        // переменная секунды, вводит пользователь
        int min_result = sec/3600;                                          // расчет часов
        int sec_remaind = sec%3600;                                         // остаток от деления
        if (sec > 3600) {                                                   // вывод ответа
            System.out.print("Ответ: ");                                    // окончания в русском языке makes me cry
            if (min_result == 1){
                System.out.print(min_result + " час и ещё осталось ");
            } else{
                if (min_result > 1 && min_result < 4){
                    System.out.print(min_result + " часа и ещё осталось ");
                }else {
                    System.out.print(min_result + " часов и ещё осталось ");
                }
            }
            if (min_result == 1){
                System.out.print(sec_remaind + " секунда");
            } else{
                if (min_result > 1 && min_result < 4){
                    System.out.print(sec_remaind + " секунды");
                }else {
                    System.out.print(sec_remaind + " секунд");
                }
            }
        } else {
            System.out.println("Меньше одного часа!");
        }
    }
}
