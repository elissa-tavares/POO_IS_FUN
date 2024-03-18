package Listas.poo_budega;

public class Solver {
    static Mercantil mercantil = new Mercantil(0);
    public static void main(String[] _args) {
        while(true) {
            String line = input();
            String[] args = line.split(" ");
            write('$' + line);

            if     (args[0].equals("init"     )) { mercantil = new Mercantil(number(args[1])); }
            else if(args[0].equals("arrive"   )) { mercantil.chegar(new Pessoa(args[1]));      }
            else if(args[0].equals("call"     )) { mercantil.chamarNoCaixa(number(args[1]));   }
            else if(args[0].equals("finish"   )) { mercantil.finalizar(number(args[1]));       }
            else if(args[0].equals("show"     )) { write(mercantil.toString());                }
            else if(args[0].equals("end"      )) { break;                                      }
            else                                 { write("fail: comando invalido");      }
        }
    }

    static Scanner scanner = new Scanner(System.in);
    public static String input()           { return scanner.nextLine();       }
    public static void write(String value) { System.out.println(value);       }
    public static int number(String str)   { return Integer.parseInt(str);    }
}
