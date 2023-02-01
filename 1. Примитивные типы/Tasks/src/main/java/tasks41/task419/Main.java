package tasks41.task419;

/* Цель: научиться выводить массив с его значениями в консоль.

Что нужно знать:
1. методы класса System
2. Arrays

Реализуйте метод, который будет принимать массив чисел, и выводить его значения в консоль c помощью методов класса Arrays

Пример ввода: {1,2,3,4,5,5,6,7,7}
Пример вывода: [1, 2, 3, 4, 5, 5, 6, 7, 7]

Пример ввода: {}
Пример вывода: []

Требования:
метод должен быть public static
сигнатура метода printArray(int[] numbers)
Элементы массива должны быть заключены в квадратные скобки []
Элементы массива отделены друг от друга запятой и пробелом. */

import java.util.Arrays;

public class Main {

    public static void printArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,5,6,7,7};
        printArray(array);
    }
}
