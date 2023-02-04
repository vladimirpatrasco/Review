package task66411;

/* Цель: Создание класса наследника

Что нужно знать:
1. Как создавать классов наследников в Java
2. Переопределение метода

Задание:
Помнишь наших студентов из прошлой задачи? Так вот, не все студенты трудолюбивые. Некоторый, бывают, ленятся.

Создай на основе класса Student класс LazyStudent, которому лень учится.
Требования:
1. класс LazyStudent должен быть public static
2. класс LazyStudent должен быть наследником Student.
3. класс LazyStudent должен иметь только один публичный контруктор - конструктор без параметров.
4. класс LazyStudent должен переопределять метод study.
5. Метод study() вызванный у объектов LazyStudent должен выводить в консоль сообщение "Сегодня не учусь, мне лень." */

public class Student {

    protected final String studying;
    protected Student(String work) {
        this.studying = work;
    }
    public Student() {
        this.studying = "Прохожу тестовое задание.";
    }
    public void study() {
        System.out.println("Я очень занят. " + studying);
    }

    public static class LazyStudent extends Student {

        public LazyStudent() {
        }

        @Override
        public void study() {
            System.out.println("Сегодня не учусь, мне лень.");
        }
    }

    public static void main(String[] args) {
        var st = new LazyStudent();
        st.study();
    }

}
