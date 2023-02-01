package tasks21.task2110;

/* Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c ?
        Допустимая погрешность – 0.0001 (1E-4)
        Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
        В качестве примера написано заведомо неправильное выражение. Исправьте его.

        public static boolean doubleExpression(double a, double b, double c) {
	        return a + b == c;
}


        Требования:
        Метод должен иметь сигнатуру: doubleExpression(double a, double b, double c) */

public class Main {

    public static boolean doubleExpression(double a, double b, double c) {
        return ((Math.abs(a + b - c)) < 0.0001);
    }

    public static void main(String[] args) {

        System.out.println(doubleExpression(1.0, 2.0, 3.0));

    }
}
