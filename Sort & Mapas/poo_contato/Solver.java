package Sort & Mapas.poo_contato;

public class Solver{

    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        Contact contact = new Contact("");

        while (true) {
            String line = scanner.nextLine();
            write("$" + line);
            String[] args = line.split(" ");
            
            if      (args[0].equals("end"))     { break;                             }
            else if (args[0].equals("init"))    { contact = new Contact(args[1]);    }
            else if (args[0].equals("show"))    { write(contact.str());              }
            else if (args[0].equals("add"))     { contact.addFone(args[1], args[2]); }
            else if (args[0].equals("rm"))      { contact.rmFone(number(args[1]));   }
            else if (args[0].equals("tfav"))    { contact.toogleFavorited();         }
            else                                { write("fail: invalid command");}
        }
        scanner.close();
    }
    public static int number(String number) { return Integer.parseInt(number); }
    public static void write(String str)    { System.out.println(str);         }
}
