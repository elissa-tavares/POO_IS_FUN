package Listas.poo_cinema;

public class Solver {
    public static void main(String[] _args) {
        Sala sala = new Sala(0);
        while (true) {
            var line = input();
            var args = line.split(" ");
            write('$' + line);

            if (args[0].equals("end")) { break; }
            else if (args[0].equals("init"))     { sala = new Sala(Integer.parseInt(args[1])); }
            else if (args[0].equals("show"))     { write(sala.toString()); }
            else if (args[0].equals("reservar")) { sala.reservar(args[1], args[2], (int) number(args[3])); }
            else if (args[0].equals("cancelar")) { sala.cancelar(args[1]); }
            else                                 { write("fail: comando invalido"); }
        }
    }

    private static Scanner scanner = new Scanner(System.in);
    private static String input() { return scanner.nextLine(); }
    private static double number(String value) { return Double.parseDouble(value); }
    private static void write(String value) { System.out.println(value); }
}
