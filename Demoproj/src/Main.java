public class Main {

    public static void main(String[] args) {
        System.out.println("Basic arithmetic!");

        double p = 12;
        double r = 3;

        BasicCalc casio = new BasicCalc(p, r);
        System.out.println(casio.divide());
    }
}
