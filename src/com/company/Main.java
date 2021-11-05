package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Объявить переменную типа String, название которой состоит из нескольких слов
        // Задать значение переменной объявленной в самом начале, которое состояло бы из результата конкатенации константы “num” и переменной “word”
        String greenTea = "30 Chocolate";
        System.out.println(greenTea);

        // Создать константу “num” типа int и задать ей любое значение
        final int num = 30;
        System.out.println(num);

        // Создать переменную “word” типа String с любым значением
        // Вывести на экран значение всех переменных в одну строку
        String word = "Chocolate";
        System.out.println(word + " " + " ");

        // Добавить условную конструкцию которая бы выводила на экран следующее: если
        // значение константы “num” меньше нуля - “Вы сохранили отрицательное число”, если же значение больше нуля - “Вы сохранили положительное число”, иначе - “Вы сохранили нуль”
        if (num < 0) {
            System.out.println("Значение num меньше 0 - вы сохранили отрицательное число");
        } else if (num == 0){
            System.out.println("Иначе значение num равно 0 - вы сохранили ноль");
        }
        else {
            System.out.println("Значение num больше 0 - вы сохранили положительное число");
        }

        Scanner apple = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String car = apple.nextLine();
        System.out.println("Введите ваше имя" + car);
    }
}