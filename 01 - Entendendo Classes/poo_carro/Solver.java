public class Solver {
    public static void main(String[] a) {
        Car car = new Car();
        
        execute:
        while (true) {
            String line = IO.input();
            //imprime todas as informações que recebi
            IO.write("$" + line);
            //vou gerar uma nova string sempre que encontrar um "" e as guardar em um array de String 
            String[] args = line.split(" ");

            //a primeira string vai ser o que quero fazer

            //meu array só vai ter uma posicao, que é a do comando, pois nao preciso passar valor para show, enter e leave
            switch (args[0]) {
                case "show":
                    IO.write(car.toString());
                    break;
                case "enter":
                    car.enter();
                    break;
                case "leave":
                    car.leave();
                    break;
                case "drive":
                    car.drive(IO.number(args[1]));
                    break;
                case "fuel":
                    car.fuel(IO.number(args[1]));
                    break;
                case "end":
                    break execute;
                default:
                    IO.write("fail: comando invalido");
            }            
        }
    }
}
