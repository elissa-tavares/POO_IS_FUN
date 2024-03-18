package Enum.poo_porquinho;

public class Solver {
    public static void main(String[] _args) {
        Pig pig = new Pig(0);

        while (true) {
            var line = input();
            var args = line.split(" ");
            write("$" + line);

            if (args[0].equals("end")) {
                break;
            }
            else if (args[0].equals("addCoin")) {
                if (args[1].equals("10")) {
                    pig.addCoin(Coin.C10);
                } else if (args[1].equals("25")) {
                    pig.addCoin(Coin.C25);
                } else if (args[1].equals("50")) {
                    pig.addCoin(Coin.C50);
                } else if (args[1].equals("100")) {
                    pig.addCoin(Coin.C100);
                }
            } 
            else if (args[0].equals("init")) {
                pig = new Pig(number(args[1]));
            } 
            else if (args[0].equals("addItem")) {
                pig.addItem(new Item(args[1], number(args[2])));
            } 
            else if (args[0].equals("break")) {
                pig.breakPig();
            } 
            else if (args[0].equals("extractCoins")) {
                write("[" + pig.extractCoins().stream().map(coin -> "" + coin.str()).collect(Collectors.joining(", "))
                        + "]");
            }

            else if (args[0].equals("extractItems")) {
                write("[" + pig.extractItems().stream().map(item -> "" + item.str()).collect(Collectors.joining(", "))
                        + "]");
            }
            else if (args[0].equals("show")) {
                write(pig.str());
            }
            else {
                write("fail: invalid command");
            }
        }
    }

    public static Scanner scanner = new Scanner(System.in);

    public static String input() {
        return scanner.nextLine();
    }

    public static int number(String number) {
        return Integer.parseInt(number);
    }

    public static void write(String str) {
        System.out.println(str);
    }
}
