public class Solver {
    public static void main(String[] a) {
        Time time = new Time();
        
        execute:
        while (true) {
            String line = IO.input();
            IO.write("$" + line);
            String[] args = line.split(" ");

            
            switch (args[0]) {
                case "show":
                    IO.write(time.toString());
                    break;
                case "init":
                    time = new Time();
                    time.setHour(IO.number(args[1]));
                    time.setMinute(IO.number(args[2]));
                    time.setSecond(IO.number(args[3]));
                    break;
                case "set":
                    time.setHour(IO.number(args[1]));
                    time.setMinute(IO.number(args[2]));
                    time.setSecond(IO.number(args[3]));
                    break;
                case "next":
                    time.next();
                    break;
                case "end":
                    break execute;
                default:
                    IO.write("fail: comando invalido");
            }            
        }
    }
}
