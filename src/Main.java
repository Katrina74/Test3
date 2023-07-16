// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        noReturn();
        System.out.println(sum(1,2));
    }

    private static void noReturn() {
        System.out.println(" return");
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}