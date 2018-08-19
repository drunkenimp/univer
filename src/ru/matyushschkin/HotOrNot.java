package ru.matyushschkin;

import java.util.Random;
import java.util.Scanner;

public class HotOrNot {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int search_num = rand.nextInt(100)+1;
        int ent_user;
        int ent_user_past = 0;
        do {
            System.out.print("Введите число: ");
            ent_user = scan.nextInt();
            if (Math.abs(search_num - ent_user) < Math.abs(search_num - ent_user_past)) {
                System.out.println("Горячо!");
            } else {
                System.out.println("Холодно!");
            }
            ent_user_past = ent_user;
        }while (search_num != ent_user);
        System.out.println("Верно!");
    }
}
