package tasks31.task3111;

/* Цель: Работа с оператором if/else

Что нужно знать:
1. Оператор if

Задание:
Реализовать метод, который будет принимать строку с названием дня недели, и отвечать, является ли этот день  выходным. Список дней недели:
"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday". Если строка не соответствует ни одному дню недели отправлять false.

Пример ввода: Monday
Пример вывода: false

Пример ввода: Saturday
Пример вывода: true

Требования:
метод должен быть public static
сигнатура метода isWeekend(String weekDay)
метод возвращает boolean
решить с использование оператора if */

public class Main {

    public static boolean isWeekend(String weekday) {
        if (weekday.equals("Monday")) {
            return false;
        } else if (weekday.equals("Tuesday")) {
            return false;
        } else if (weekday.equals("Wednseday")) {
            return false;
        } else if (weekday.equals("Thursday")) {
            return false;
        } else if (weekday.equals("Friday")) {
            return false;
        } else if (weekday.equals("Sunday")) {
            return true;
        } else if (weekday.equals("Saturday")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isWeekend("Saturday"));
    }

}
