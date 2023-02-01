package tasks31.task318;

/* Реализуйте предыдущую задачу с использованием рекурсии.

Пример ввода 1: 1
Пример возвращаемого значения 1: 1

Пример ввода 2: 3
Пример возвращаемого значения 2: 6

Требования:
1. Метод должен быть public.
1. Метод должен быть static.
3. Передаваемый параметр должен иметь тип int.
4. Реализация метода должна быть через рекурсию. */

import java.math.BigInteger;

public class Main {

    public static BigInteger factorial(int value) {
        if (value <= 1) {
            return BigInteger.valueOf(1);
        } else {
            return BigInteger.valueOf(value).multiply(factorial((value -1)));
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

}
