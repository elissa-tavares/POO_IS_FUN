package Agregação.poo_motoca;

public class Motorcycle {
    private Person person; //agregacao
    private int power;
    private int time;
    
    //Inicia o atributo power, time com zero e person com null
    public Motorcycle(int power){
    }
    public int getPower() {
    }
    public int getTime() {
    }
    public Person getPerson() {
    }

    
    //Se estiver vazio, coloca a pessoa na moto e retorna true
    public boolean enter(Person person) {
    }
    public Person leave() {
    }
    //Comprar mais tempo
    public void buy(int time){
    }
    public void drive(int time){
    }
    //buzinar
    public void honk(){
    }
    public String toString(){
        var value = this.person == null ? "empty" : this.person;
        return "power:" + this.power + ", time:" + this.time + ", person:(" + value + ")";
    }
}
