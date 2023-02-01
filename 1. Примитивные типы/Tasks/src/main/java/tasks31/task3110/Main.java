package tasks31.task3110;

/* Цель: Работа с оператором switch

Что нужно знать:
1. Оператор switch

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
решить с использование оператора switch */

public class Main {

    public static boolean isWeekend(String weekday) {
        return switch (weekday) {
            case ("Monday") -> false;
            case ("Tuesday") -> false;
            case ("Wednesday") -> false;
            case ("Thursday") -> false;
            case ("Friday") -> false;
            case ("Saturday") -> true;
            case ("Sunday") -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        System.out.println(isWeekend("Sunday"));
    }
}
