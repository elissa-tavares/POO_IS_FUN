import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Calculator {
    private int BATERRY_MAX;
    private int battery;
    private float display;

    public Calculator() {
        this.battery = 0;
        this.display = 0f;
        this.BATERRY_MAX = 0;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00", new DecimalFormatSymbols(Locale.US));
        String formattedDisplay = df.format(display);
        return "display = " + formattedDisplay + ", battery = " + battery;
    }

    public void chargeBattery(int value) { //nao aumenta a bateria alem do BATERRY_MAX
        if(battery + value > BATERRY_MAX){
            battery = BATERRY_MAX;
            return;
        }
        battery += value;
    }

    private boolean useBattery() {
        if(battery <= 0){
            System.out.println("fail: bateria insuficiente");
            return false;
        }
        return true;
    }

    public void sum(int a, int b) {
        if (useBattery()) {
            battery--;
            display = (float) a + b;
        }
    }

    public void division(int num, int den) {
        if(useBattery()){
            battery--;

            if(den == 0){
                System.out.println("fail: divisao por zero");
                return;
            }
            display =  (float) num / den;
        }
    }
    public void setBATERRY_MAX(int max){
        this.BATERRY_MAX = max;
    }
}