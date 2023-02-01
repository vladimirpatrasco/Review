package task5110;

/* Цель: Работа с регулярными выражениями

Что нужно знать:
1. Классы String, Pattern, Matcher
2. Регулярные выражения

Задание:
Реализовать метод, который будет принимать целочисленное строку, и отвечать соответствует ли эта строка почтовому ящику сервисов google (gmail.com)
или майкрософт (outlook.com). Будет считать, что в корректном почтовом ящике можно использовать только цифры и буквы.



Пример ввода: "kata12@gmail.com"
Пример вывода: true

Пример ввода: "@outlook.com"
Пример вывода: false

Требования:
метод должен быть public static
сигнатура метода isGmailOrOutlook(String email)
метод возвращает boolean */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static boolean isGmailOrOutlook(String email) {
        Pattern p = Pattern.compile("^[a-z0-9]+(@gmail.com|@outlook.com)");
        Matcher m = p.matcher(email);
        return m.matches();
    }

    public static void main(String[] args) {
        System.out.println(isGmailOrOutlook("a123@gmail.com"));
    }



}
