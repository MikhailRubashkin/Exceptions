import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//	Написать метод, который в 50% случаев бросает исключение.
//          Вызвать этот метод в конструкции try-catch-finally. Протестировать работу блока finally.

public class Task_7 {

    public static void main(String[] args) {


        byte[] bytesToWrite = new byte[100];
        OutputStream os = null;
        try {
            os = new FileOutputStream("output.file");
            os.write(bytesToWrite);
            System.out.println("end try");
        } catch (FileNotFoundException fnfe) {
            System.out.println("Cannot find the file.");
        } catch (IOException ioex) {
            System.out.println("Error writing file: " + ioex.getMessage());
        } finally {
            System.out.println("finally.");
            if (os != null) {

                try {
                    os.close();
                } catch (IOException closeException) {
                    System.out.println("closeException: "
                            + closeException.getMessage());
                }
            }
        }

        System.out.println("End of program.");
    }
}
