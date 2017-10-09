package by.it.sc03_evening_mon_fri.martinovich.lesson03;

/*
напишите тело main программы которая выводит на экран 5 строк
Я начинаю изучать Java!

Для ручной проверки запустите программу Ctrl+Shift+F10
Для автоматической проверки откройте и запустите класс Testing
*/
class TaskA2 {
    public static void main(String[] args) {

        print5Times("Я начинаю изучать Java!");
        print5Times("Hello!");

    }

    private static void print5Times(String text) {
        int linesPrinted = 0;

        while (linesPrinted < 5) {
            System.out.println(text);
            linesPrinted = linesPrinted + 1;
        }
    }

    private static int sqrt() {

    }
}