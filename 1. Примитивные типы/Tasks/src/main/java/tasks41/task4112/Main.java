package tasks41.task4112;

/* Напишите метод printOddNumbers, который принимает массив и выводит в консоль только нечетные числа из него, через запятую. Конец вывода должен перевести
курсор на новую строку.

Пример ввода: [3,5,20,8,7,3,100]
Пример вывода: 3,5,7,3

Требования:
Сигнатура метода должна быть: printOddNumbers(int[] arr) */

import java.util.Arrays;

public class Main {

    public static void printOddNumbers(int[] arr) {
        StringBuilder strb = new StringBuilder();
        for(int i = 0; i <arr.length; i++) {
            if (arr[i] % 2 != 0) {
                strb.append(arr[i]).append(",");
            }
        }
        strb.deleteCharAt(strb.length() - 1).append("\n");
        System.out.println(strb);
    }

    public static void main(String[] args) {
        int[] arr = {3,5,20,8,7,3,100};
        printOddNumbers(arr);
    }


}
