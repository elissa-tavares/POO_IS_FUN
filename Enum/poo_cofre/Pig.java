package Enum.poo_cofre;

public class Pig {
    private ArrayList<Valuable> valuables;
    private int volumeMax;
    private boolean broken = false;
    
    //inicializa o volumeMax
    public Pig(int volumeMax) {
    }

    public double calcValue() {


    }


    //se não estiver quebrado e couber, adicione no volume e na descrição
    public boolean addValuable(Valuable val) {

    }

    //quebre o pig, zere o volume
    public boolean breakPig(){
    }

    //se estiver quebrado, retorne as moedas e as retire do porco
    //se não estiver quebrado, retorne uma lista vazia
    public ArrayList<Coin> extractCoins(){
    }

    //se estiver quebrado, pegue e retorno os itens
    //se não estiver quebrado, emita o erro e retorne uma lista vazia
    public ArrayList<Item> extractItems(){
    }

    public int getVolume() {
    }

    public float getValue() {
    }

    public int getVolumeMax() {
    }

    public boolean isBroken() {
    }

    public String toString() {
    }
}
