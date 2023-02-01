package tasks22.task222;

/* Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
В качестве примера написано заведомо неправильное выражение. Исправьте его.

Требования:
1. Сигнатура метода должна быть: charExpression(int a) */

public class Main {

    public static char charExpression(int a) {
        char symbol = '\\';
        int symbolPos = symbol;
        int resPos = symbolPos + a;
        return (char) resPos;
    }

    public static void main(String[] args) {
        System.out.println(charExpression(1));
    }


}
