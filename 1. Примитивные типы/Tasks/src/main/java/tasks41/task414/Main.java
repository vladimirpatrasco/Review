package tasks41.task414;

/* Дан массив возрастающих чисел. Даны два числа. Задача - написать метод, который из данного массива достанет ту часть, которая лежит между данными числами
(включительно).

Что нужно знать:
1. Работта с массивами
2. Циклы
3. Условные операторы

Пример ввода: {1,3,5,6,9,11,24}, 4, 10
Пример вывода: [5, 6, 9]

Требования:
метод должен быть public static
сигнатура метода getSubArrayBetween(int[] numbers, int start, int end */

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start & numbers[i] <= end) {
                count++;
            }
        }
        int flag = 0;
        int[] array = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start & numbers[i] <= end) {
                array[flag] = numbers[i];
                flag++;
            }
        }
        String s = Arrays.toString(array);
        System.out.println(s);
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1,3,5,6,9,11,24};
        getSubArrayBetween(array,4,10);
    }
}
