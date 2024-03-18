package Enum.poo_cofre;

enum Coin implements Valuable {
    M10(0.10, 1, "M10"),
    M25(0.25, 2, "M25"),
    M50(0.50, 3, "M50"),
    M100(1.00, 4, "M100");

    private double value;
    private int volume;
    private String label;
    
    private Coin(double value, int volume, String label) {
    }
    
    @Override
    public String getLabel() {
    }

    @Override
    public int getVolume() {
    }

    @Override
    public double getValue() {
    }

    public String toString() {
    }
}
