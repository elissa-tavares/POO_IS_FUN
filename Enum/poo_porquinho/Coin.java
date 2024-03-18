package Enum.poo_porquinho;

enum Coin {
    C10(0.10, 1, "C10"),
    C25(0.25, 2, "C25"),
    C50(0.50, 3, "C50"),
    C100(1.00, 4, "C100");

    private final double value;
    private final int volume;
    private final String label;

    Coin(double value, int volume, String label) {
        this.value = value;
        this.volume = volume;
        this.label = label;
    }

    public double getValue() {
        return value;
    }

    public int getVolume() {
        return volume;
    }

    public String getLabel() {
        return label;
    }

    public String str() {
        return String.format("%.2f:%d", value, volume);
    }
}
