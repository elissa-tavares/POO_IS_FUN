import java.util.Scanner;

class IO {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static String input() {
        return scanner.nextLine();
    }

    public static void write(String value) {
        System.out.println(value);
    }

    public static int number(String str) {
        return Integer.parseInt(str);
    }
}