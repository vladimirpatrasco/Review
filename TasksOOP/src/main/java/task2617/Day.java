package task2617;

/* Цель: Научиться создавать перечисления (Enum)

Что нужно знать:
1. Enum

Задание:
Реализовать Enum Day, который будет отвечать за дни недели. Этот Enum должен содержать следующие элементы:
MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
Так же, в этом Enum должны быть релизованы два метода:
1. public boolean isWeekend() - метод, отвечающий на вопрос, является ли конкретный элемент - выходным днем. (выходным днем являются только суббота и воскресенье)
2. public String getRusName() - метод, возвращающий русское название дня недели

Требования:
Enum должен иметь название Day
Enum должен содеражить элементы на каждый день недели
сигнатура метода isWeekend()
метод isWeekend возвращает boolean
сигнатура метода getRusName()
метод getRusName возвращает String */

public enum Day {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekend() {
        switch (this) {
            case SATURDAY -> {
                return true;
            }
            case SUNDAY -> {
                return true;
            }
        }
        return false;
    }

    public String getRusName() {
        switch (this) {
            case MONDAY -> {
                return "Понедельник";
            }
            case TUESDAY -> {
                return "Вторник";
            }
            case WEDNESDAY -> {
                return "Среда";
            }
            case THURSDAY -> {
                return "Четверг";
            }
            case FRIDAY -> {
                return "Пятница";
            }
            case SATURDAY -> {
                return "Суббота";
            }
            case SUNDAY -> {
                return "Воскресенье";
            }
        }
        return "";
    }

}