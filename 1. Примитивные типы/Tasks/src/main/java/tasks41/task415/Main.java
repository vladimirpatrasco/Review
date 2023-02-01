package tasks41.task415;

/* Цель: Вернуть середину массива

Что нужно знать:
1. Массивы
2. Условные операторы
3. Циклы

Задание:
Дан массив произвольной длины. Необходимо вернуть центральную часть массива, при чем, если массив четной длины, то вернуть массив из двух элементов,
если нечетной, то вернуть массив из одного элемента.

Пример ввода: {1, 5, 2, 17}
Пример вывода: [5, 2]

Пример ввода: {14, 16, 3}
Пример вывода: [16]

Пример ввода: {}
Пример вывода: []

Требования:
Метод должен быть public static
Сигнатура метода getArrayMiddle(int[] numbers)
Не использовать Arrays, System.arrayCopy */

import java.util.Arrays;

public class Main {

    public static void getArrayMiddle(int[] numbers) {
            if (numbers.length % 2 != 0) {
                int[] array = new int[1];
                array[0] = numbers[numbers.length/2];
                String s = Arrays.toString(array);
                System.out.println(s);
            } else if (numbers.length % 2 == 0) {
                int[] array = new int[2];
                array[0] = numbers[(numbers.length/2) - 1];
                array[1] = numbers[numbers.length/2];
                String s = Arrays.toString(array);
                System.out.println(s);
            }
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 17,18,5};
        getArrayMiddle(array);
    }
}
