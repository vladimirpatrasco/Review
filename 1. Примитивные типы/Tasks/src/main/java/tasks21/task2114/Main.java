package tasks21.task2114;

import java.lang.Long;
import java.math.BigInteger;

/* Цель: Использовать арифметические операции с BigInteger

Что нужно знать:
1. класс BigInteger
2. класс Long

Задание:
Реализовать метод, который выведет на экран квадрат максимального значения, которое может содержаться в переменной long. Чтобы это значение уместилось,
необходимо использовать класс BigInteger

Требования:
метод должен быть public static
сигнатура метода maxLongSqr() */

public class Main {

    public static void maxLongSqr() {
        BigInteger number = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println(number.multiply(number));
    }

    public static void main(String[] args) {
        maxLongSqr();
    }
}
