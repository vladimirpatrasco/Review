package tasks21.task217;

/* Напишите публичный метод priceCalculation, который считает стоимость товара.
        В метод передается цена товара (может быть дробной) и количество товара, метод должен возвращать итоговую цену покупки.

        Пример ввода: 8.50, 2
        Пример вывода: 17.0

        Требования:
        Сигнатура метода должна быть: priceCalculation(double price, int count) */

public class Main {

    public double priceCalculation(double price, int count) {
        return price * count;
    }

    public static void main(String[] args) {
        Main test = new Main();
        System.out.println(test.priceCalculation(8.50,2));
    }

}
