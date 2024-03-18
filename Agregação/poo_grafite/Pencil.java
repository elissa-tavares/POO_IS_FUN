package Agregação.poo_grafite;

public class Pencil {
    private float thickness;
    private Lead tip;

    public Pencil(float thickness) {
    }

    public float getThickness() {
    }

    public void setThickness(float value) {
    }

    public boolean hasLead() {
    }

    public boolean insert(Lead grafite) {
    }

    public Lead remove() {
    }

    public void writePage() {
    }
    
    public String toString() {
        String saida = "calibre: " + thickness + ", grafite: ";
        if (tip != null)
            saida += "[" + tip + "]";
        else
            saida += "null";
        return saida;
    }
}
