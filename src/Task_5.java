
//	Бросить одно из существующих в JDK исключений, отловить его и выбросить своё собственное, указав в качестве причины отловленное.

public class Task_5 {

    static void method()
    {
        try {
            throw new NullPointerException("Exception in method");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
    public static void main(String args[])
    {
        try {
            method();
        } catch(NullPointerException e) {
            System.out.println("Catch inside main : " +
                    e.getMessage());
        }
    }
}
