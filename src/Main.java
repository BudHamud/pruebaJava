

public class Main {
    public static void main(String[] args) {
        int pesos = 2000;

        double pesosConIva = calculatorIva(pesos);

        System.out.println(pesosConIva);
    }

    static double calculatorIva(int pesos) {
        return pesos * 1.21;
    }
}