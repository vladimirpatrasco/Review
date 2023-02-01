package tasks41.task417;

/* Цель: Слить два произвольных массива в один отсортированный

Что нужно знать:
1. Массивы
2. Циклы
3. Условные операторы

Задание:
Реализовать метод mergeAndSort(int[] firstArray, int[] secondArray), который принимает соединяет и сортирует два произвольных массива чисел

Пример ввода: {1, 3, 7, 5}, {8, 4, 2, 4}
Пример вывода: [1, 2, 3, 4, 4, 5, 7, 8]

Пример ввода: {} {1, 4, 3}
Пример вывода: [1, 3, 4]

Требования:
метод должен быть public static
сигнатура метода mergeAndSort(int[] firstArray, int[] secondArray)
Не использовать Arrays.  */

import java.util.Arrays;

public class Main {

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] newarray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray,0,newarray,0,firstArray.length);
        System.arraycopy(secondArray,0,newarray,firstArray.length, secondArray.length);
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 1; i < newarray.length; i++) {
                if (newarray[i] < newarray[i - 1]) {
                    int temp = newarray[i];
                    newarray[i] = newarray[i - 1];
                    newarray[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        return newarray;
    }

    public static void main(String[] args) {
        int[] fa = {1, 3, 7, 5};
        int[] sa = {8, 4, 2, 4};
        mergeAndSort(fa,sa);
    }

}
