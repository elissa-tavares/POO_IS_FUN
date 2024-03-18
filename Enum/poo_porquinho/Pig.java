package Enum.poo_porquinho;

public class Pig {
    private ArrayList<Item> itens = new ArrayList<>();
    private ArrayList<Coin> coins = new ArrayList<>();
    private int volumeMax = 0;
    private boolean broken = false;

    public Pig(int volumeMax) {
    }

    public boolean addCoin(Coin coin) {
    }

    public boolean addItem(Item item) {
    }

    public boolean breakPig() {
    }

    public ArrayList<Coin> extractCoins() {
    }

    public ArrayList<Item> extractItems() {
    }

    public double getValue() {
    }

    public int getVolume() {
    }
    public String str() {
        StringJoiner coinsStr = new StringJoiner(", ");
        coins.stream().map(n -> n.str()).forEach(coinsStr::add);
        StringJoiner itens = new StringJoiner(", ");
        this.itens.stream().map(n -> n.str()).forEach(itens::add);

        return String.format("state=%s : coins=[%s] : items=[%s] : value=%.2f : volume=%d/%d",
                (broken ? "broken" : "intact"), coinsStr.toString(), itens.toString(), getValue(), getVolume(), volumeMax);
    }

}
