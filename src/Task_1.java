public class Task_1 {

//	Объявите переменную со значением null. Вызовите метод у этой переменной.
//Отловите возникшее исключение.

    public static void main(String[] args) {

        try {
            System.out.println(" До генерации исключения");
            int i = Integer.parseInt(null); // создание ошибки
            System.out.println("Значение : " + i);
        } catch (IllegalArgumentException exc) { //перехват исключения
            System.out.println("Вывод null в консоль");
        }
        System.out.println(" После оператора catch");
    }
}
