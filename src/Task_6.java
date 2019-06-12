

// Создать метод случайным образом выбрасывающий одно из 3-х видов исключений.
//          Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.

public class Task_6 {

    public static void main(String args[]) {

        try {
            int c[] = {1};
            int a = args.length;
            System.out.println("a = " + String.valueOf(a));
            c[4] = 222;
            int b = 23 / a;

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException : " +
                    e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "ArrayIndexOutOfBoundsException : "
                            + e.getMessage());
        } catch (Exception e) {
            System.out.println("ArithmeticException : " +
                    e.getMessage());
        }


    }
}
