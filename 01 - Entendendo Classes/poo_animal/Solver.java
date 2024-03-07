import java.util.Scanner;


public class Solver {
    static Scanner scanner = new Scanner(System.in);

    public static String input() {
        return scanner.nextLine();
    }

    public static void write(String value) {
        System.out.println(value);
    }

    public static double number(String str) {
        return Integer.parseInt(str);
    }


    public static void main(String[] _args) {
        Animal animal = new Animal();

        while (true) {
            String line = input();
            String[] args = line.split(" ");
            write("$" + line);

            if (args[0].equals("init")) {
                animal = new Animal();
                animal.setEspecie(args[1]);
                animal.setBarulho(args[2]);
            } else if (args[0].equals("grow")) {
                animal.envelhecer((int) number(args[1]));
            } else if (args[0].equals("noise")) {
                write(animal.fazerBarulho());
            } else if (args[0].equals("show")) {
                write(animal.toString());
            } else if (args[0].equals("end")) {
                scanner.close();
                break;
            } else {
                write("fail: comando invalido");
            }
        }
    }
}
