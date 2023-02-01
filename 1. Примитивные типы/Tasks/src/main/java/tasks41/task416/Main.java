package tasks41.task416;

/* Цель: Развернуть данный массив

Что нужно знать:
1. Работа с массивами
2. Циклы

Задание: Напистаь метод, который принимает массив, разворачивает его и возвращает.

Пример ввода: {1, 4, 6, 7}
Пример вывода: [7, 6, 4, 1]

Пример ввода: {}
Пример вывода: []

Требования:
метод должен быть public static
сигнатура метода inverseArray(int[] numbers) */

import java.util.Arrays;

public class Main {

    public static int[] inverseArray(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        String s = Arrays.toString(numbers);
        System.out.println(s);
        return numbers;
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 6, 7};
        inverseArray(array);
    }


}
