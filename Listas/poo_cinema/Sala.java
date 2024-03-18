package Listas.poo_cinema;

public class Sala{
    private List<Client> cadeiras;


    public Sala(int capacidade) {
    }

    public List<Client> getCadeiras() {
    }
    
    public boolean reservar(String id, String fone, int ind) {

    }

    public void cancelar(String id) {
    }

    @Override
    public String toString() {
        return "[" + this.cadeiras.stream().map(c -> (c == null) ? "-" : c.toString()).collect(Collectors.joining(" ")) + "]";
    }
}
