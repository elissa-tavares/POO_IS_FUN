public class Solver {   
    public static void main(String[] _args) {
        Animal animal = new Animal();

        execute:
        while (true) {
            String line = IO.input();
            String[] args = line.split(" ");
            IO.write("$" + line);

            switch(args[0]) {
                case "init":
                    animal = new Animal();
                    animal.setEspecie(args[1]);
                    animal.setBarulho(args[2]);
                    break;
                case "grow":
                    animal.envelhecer(IO.number(args[1]));
                    break;
                case "noise":
                    IO.write(animal.fazerBarulho());
                    break;
                case "show":
                    IO.write(animal.toString());
                    break;
                case "end":
                    break execute;
                default:
                    IO.write("fail: comando invalido");
            }            
        }
    }
}
