//para instanciar um objeto de outra class, preciso importar a class para poder dar um new
import java.util.Scanner;

public class Solver {
    //variáves static para que a minha main a consiga reconhecer
    //Não é possível fazer uma referência estática ao método ou atributo se ele nao for estático

    //é uma contante porque eu nao modifico ela ao longo da minha class
    private static final Scanner scanner = new Scanner(System.in);
    
    private static String  input()              { return scanner.nextLine(); }
    private static int  number(String value) { return Integer.parseInt(value); }
    private static void    write(String value)  { System.out.println(value); }
    public static void main(String[] a) {
        Car car = new Car();
        
        while (true) {
            String line = input();
            //imprime todas as informações que recebi
            write("$" + line);
            //vou gerar uma nova string sempre que encontrar um "" e as guardar em um array de String 
            String[] args = line.split(" ");

            //a primeira string vai ser o que quero fazer

            //meu array só vai ter uma posicao, que é a do comando, pois nao preciso passar valor para show, enter e leave
            if(args[0].equals("show")){ 
                write(car.toString());        
            }
            else if (args[0].equals("enter")) { 
                car.enter();                          
            }
            else if (args[0].equals("leave")) { 
                car.leave();                          
            }
            //tem duas posições pois para o comando drive e fuel, preciso de um valor
            else if (args[0].equals("drive")) {
                car.drive((int) number(args[1]));     
            }
            else if (args[0].equals("fuel"))  {
                car.fuel((int) number(args[1]));      
            }
            else if (args[0].equals("end"))   { 
                break;                                
            }
            else                              { 
                write("fail: comando invalido");
            }
        }
    }
}
