package com.company.homeWork.Cycles;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

//Задача_12/Пользователь вводит 2 числа.
// Сообщите, есть ли в написании двух чисел одинаковые цифры.
// Например, для пары 123 и 3456789, ответом будет являться “ДА”, а, для пары 500 и 99 - “НЕТ”.
public class Task_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите а");
        int a = s.nextInt();
        System.out.println("Введите b");
        int b = s.nextInt();
        int c = 0;
        int d = 0;
        int match = 0;

        for (int i = 0; a != 0; i++) {
            c = a % 10;
            a /= 10;

            for (int j = 0; b != 0; j++) {
                d = b % 10;
                b /= 10;

                if (c == d) {
                    match++;


                }


            }

        }
        if (match>0){
            System.out.println("Yes");
        }
        else if (match==0){
            System.out.println("no");
        }

    }

}




