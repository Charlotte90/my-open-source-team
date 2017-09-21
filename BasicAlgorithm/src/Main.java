import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello and good to have you today");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number below");
        double num1 = scanner.nextDouble();

        System.out.println("Please enter second number below");
        double num2 = scanner.nextDouble();

        BasicCalc calculator  = new BasicCalc(num1, num2);
        double result = calculator.divide();
        System.out.println(result);
    }
}
