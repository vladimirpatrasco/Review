package tasks22.task223;

/* Цель: Узнать про неявные приведения

Что нужно знать:
1. Арифметические операции
2. Примитивные типы
3. неявные приведения

Задание:
Реализовать метод, который будет принимать два числа, выражающие возраст людей, и возвращать разницу в возрасте.

Пример ввода: 2, 5
Пример вывода: 3

Пример ввода: 4, 1
Пример вывода: 3

Требования:
метод должен быть public static
сигнатура метода getAgeDiff(byte age1, byte age2)
метод возвращает byte */

public class Main {

    public static byte getAgeDiff(byte age1, byte age2) {
        return (byte)(Math.abs(age1 - age2));
    }

    public static void main(String[] args) {
        System.out.println(getAgeDiff((byte) 2,(byte)5));
    }
}
