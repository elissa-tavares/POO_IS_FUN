package Agregação.poo_lapiseira;

public class Solver{
    public static void main(String[] _args) {
        
        Pencil lapiseira = new Pencil(0.5f);

        while(true) {
            var line = input();
            var args = line.split(" ");
            write("$" + line);

            if(args[0].equals("end")) {
                break;
            } else if(args[0].equals("init")) { //thickness
                lapiseira = new Pencil(number(args[1]));
            } else if(args[0].equals("insert")) {//thickness hardness size
                lapiseira.insert(new Lead(number(args[1]), args[2], (int) number(args[3])));
            } else if(args[0].equals("remove")) {
                lapiseira.remove();
            } else if(args[0].equals("show")) {
                write("" + lapiseira);
            } else if (args[0].equals("write")) {
                lapiseira.writePage();
            } else if (args[0].equals("pull")) {
                lapiseira.pull();
            }  else {
                write("fail: comando invalido");
            }
        }
    }

    static Scanner scanner = new Scanner(System.in);
    public static String input()           { return scanner.nextLine();    }
    public static void write(String value) { System.out.println(value);    }
    public static int number(String str)   { return Integer.parseInt(str); }
}
