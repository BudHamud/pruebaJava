

public class Main {
    public static void main(String[] args) {
        String[] names = { "Pepe", "Pepa", "Harold" };

        loopArr(names);
    }

    static double ivaCalculator(int pesos) {
        return pesos * 1.21;
    }

    static void loopArr(String[] arr) {
        for ( String name : arr ) {
            System.out.println(name);
        }
    }
}