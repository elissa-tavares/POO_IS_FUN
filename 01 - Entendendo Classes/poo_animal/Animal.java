public class Animal {
    private String especie;
    private String barulho;
    private int estagio;

    public Animal() {
        this.estagio = 0;
    }

    @Override
    public String toString() {
        return especie + ":" + estagio +":" + barulho;
    }

    public String fazerBarulho() {
        if (estagio == 0) {
            return "---";
        }
        if (estagio == 4) {
            return "RIP";
        }
        return barulho;
    }

    public void envelhecer(int nivel) {
        estagio += nivel;
        if (estagio >= 4) {
            System.out.println("warning: " + especie + " morreu");
            estagio = 4;
        }
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setBarulho(String barulho) {
        this.barulho = barulho;
    }

}
