
//	Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.

public class Task_2 {

    public static void main(String[] args) {
        int nums[] = new int[4];

        try {
            System.out.println(" До генерации исключения");
            nums[7] = 10; // Выход за границы масива
            System.out.println("Эта строка не отобразится");
        } catch (ArrayIndexOutOfBoundsException exc) { //перехват исключения выхода за границы масива
            System.out.println("Выход за границы масива");
        }
        System.out.println(" После оператора catch");
    }
}
