package Agregação.poo_lapiseira;

public class Pencil {
    private float thickness;
    private Lead tip; //lead da ponta
    private ArrayList<Lead> barrel; //grafites no cano

    public Pencil(float thickness) {
    }

    //insere um lead no barril
    public boolean insert(Lead lead) {
    }

    //remove e retorna o lead da ponta
    public Lead remove() {
    }

    // se a ponta estiver vazia, puxa o próximo lead do barril
    public boolean pull() {
    }

    //se tiver grafite suficiente no bico, gaste e retorne true
    //lembre que os últimos 10mm não podem ser utilizados
    public void writePage() {
    }
    public String toString() {
        String saida = "calibre: " + thickness + ", bico: ";
        if (this.tip != null) {
            saida += "[" + this.tip + "]";
        } else {
            saida += "[]";
        }
        saida += ", tambor: {";
        for (Lead g : barrel) {
            saida += "[" + g + "]";
        }
        return saida + "}";
    }
}
