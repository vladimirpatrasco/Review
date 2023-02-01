package tasks41.task413;

/* Цель: научиться выводить массив с его значениями в консоль.

Что нужно знать:
1. методы класса System
2. циклы

Задание:
В java для вывода информации в консоль используются методы System.out.print(), System.out.println(). Однако если мы захотим вывести на экране массив
с его значениями, просто поместив его в этот метод, например так:
int[] numbers = {1, 2 ,3 ,4 ,5};
System.out.println(numbers);
то в консоли мы увидем что-то типа такого:
[I@7ba4f24f
Все потому что по умолчанию в массивах используется метод toString, определенный в классе Object.
Поэтому для вывода значения массива в кнсоль нам понадобится написать свой метод.
Реализуйте метод, который будет принимать массив чисел, и выводить его значения в консоль.

Пример ввода: {1,2,3,4,5,5,6,7,7}
Пример вывода: [1, 2, 3, 4, 5, 5, 6, 7, 7]

Пример ввода: {}
Пример вывода: []

Требования:
метод должен быть public static
сигнатура метода printArray(int[] numbers)
Элементы массива должны быть заключены в квадратные скобки []
Элементы массива отделены друг от друга запятой и пробелом.
Не использовать класс Arrays */

public class Main {

    public static void printArray(int[] numbers) {

        StringBuilder strb = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                strb.append("[").append(numbers[i]).append(", ");
            } else {
                strb.append(numbers[i]).append(", ");
            }
        }
        strb.deleteCharAt(strb.length() - 2);
        strb.append("]");
        System.out.print(strb.deleteCharAt(strb.length() - 2));
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,5,6,7,7};
        printArray(array);
    }


}
