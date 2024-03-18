public class Solver {
    public static void main(String[] _args) {
        Calculator calc = new Calculator();
        
        execute:
        while (true) {
            String line = IO.input();
            String[] args = line.split(" ");
            IO.write('$' + line);

            switch(args[0]) {
                case "show":
                    IO.write(calc.toString());
                    break;
                case "init":
                    calc = new Calculator();
                    calc.setBATERRY_MAX(IO.number(args[1]));
                    break;
                case "charge":
                    calc.chargeBattery(IO.number(args[1]));
                    break;
                case "sum":
                    calc.sum(IO.number(args[1]), IO.number(args[2]));
                    break;
                case "div":
                    calc.division(IO.number(args[1]), IO.number(args[2]));
                    break;
                case "end":
                    break execute;
                default:
                    IO.write("fail: comando invalido");
            }
        }
    }
}