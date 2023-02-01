package tasks41.task4110;

/* Цель: Вернуть середину массива

Что нужно знать:
1. Массивы
2. Класс Arrays.

Задание:
Дан массив произвольной длины. Необходимо вернуть центральную часть массива, при чем, если массив четной длины, то вернуть массив из двух элементов, если нечетной, то вернуть массив из одного элемента.

Пример ввода: {1, 5, 2, 17}
Пример вывода: [5, 2]

Пример ввода: {14, 16, 3}
Пример вывода: [16]

Пример ввода: {}
Пример вывода: []

Требования:
Метод должен быть public static
Сигнатура метода getArrayMiddle(int[] numbers)
Использовать Arrays или System.arrayCopy */

import java.util.Arrays;

public class Main {

    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length % 2 == 0) {
            int[] newarray = Arrays.copyOfRange(numbers, numbers.length / 2 - 1, numbers.length / 2 + 1);
            String s = Arrays.toString(newarray);
            System.out.println(s);
            return newarray;
        } else {
            int[] newarray = Arrays.copyOfRange(numbers, numbers.length / 2, numbers.length / 2 + 1);
            String s = Arrays.toString(newarray);
            System.out.println(s);
            return newarray;
        }
    }

    public static void main(String[] args) {
        int[] array = {14, 16, 3};
        getArrayMiddle(array);
    }

}
