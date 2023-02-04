package task3628;

/* Цель: Переиспользование методов

Что нужно знать:

1. if/else

2. Массивы

3. Циклы

Одним из принципов хорошего кода является DRY - Don’t repeat yourself (не повторяй себя). Простыми словами, его идея заключается в том, что при написании
кода программист не должен одинаковую копировать логику/код в несколько разных мест, вместо этого код нужно организовывать на такие логические куски,
которые можно будет переиспользовать.

Задание:

Реализуй три метода:
1. boolean isWeekend(String dayName) - метод принимает строку и отвечает, является ли данная строка выходным днем. Выходным днем являются Sunday и Saturday.
2. int weekendCount(String[] days) - метод принимает массив строк и возвращает количество выходных дней в этом массиве.
3. int weekdayCount(String[] days) - метод принимает массив строк и возвращает количество будних дней в этом массиве.

Требования:
методы должы быть public static
сигнатура метода isWeekend(String dayName)
метод возвращает boolean
сигнатура метода weekendCount(String[] days)
метод возвращает int
сигнатура метода weekdayCount(String[] days)
метод возвращает int
переиспользовать методы, не копировать код */

public class Main {

    boolean isWeekend(String dayName) {
        return dayName.equals("Saturday") | dayName.equals("Sunday");
    }

    int weekendCount(String[] days) {
        int countDays = 0;
        for (String day : days) {
             if (isWeekend(day)) {
                 countDays++;
             }
        }
        return countDays;
    }

    int weekdayCount(String[] days) {
        return days.length - weekendCount(days);
    }

    public static void main(String[] args) {
        var m = new Main();
        System.out.println(m.isWeekend("Thursday"));
        String[] days = {"Monday", "Thursday", "Saturday","Wednesday", "Friday"};
        System.out.println(m.weekendCount(days));
        System.out.println(m.weekdayCount(days));
    }


}
