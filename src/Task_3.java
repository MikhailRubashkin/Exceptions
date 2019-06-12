
//	Создать собственный класс-исключение - наследник класса Exception.
public class Task_3  {

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (Task_3.MyException e) {
            System.out.println("Перехваченное исключение." + e);
        }
    }

    public static void compute(int a) throws Task_3.MyException {
        System.out.println("Вызван метод compute(" + a + ")");
        if (a > 10) {
            throw new Task_3.MyException(a, "Some message");
        }
        System.out.println("Нормальное завершение.");
    }


    static class MyException extends Exception {
        private int detail;

        public MyException(int detail, String message) {
            super(message);
            this.detail = detail;
        }

        @Override
        public String toString() {
            return "MyException{"
                    + "detail=" + detail
                    + ", message=" + getMessage()
                    + "} ";
        }
    }
}