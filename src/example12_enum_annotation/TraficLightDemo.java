package example12_enum_annotation;


public class TraficLightDemo {
    public static void main(String[] args) {
        TraficLightSimulator traficLightSimulator
                = new TraficLightSimulator(TraficLightColor.GREEN);

        for (int i = 0; i < 9; i++) {
            System.out.println(traficLightSimulator.getTraficLightColor());
            traficLightSimulator.waitForChange();
        }
        traficLightSimulator.cancel();
    }
}