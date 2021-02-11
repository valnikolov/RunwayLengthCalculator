import java.util.Scanner;

public class RunwayLengthCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter airplane velocity in m/s: ");
        double v = scanner.nextDouble();

        System.out.print("Enter airplane acceleration in m/s^2: ");
        double a = scanner.nextDouble();

        double minimumRunwayLength = (v * v) / (2 * a);

        System.out.printf("Minimum runway length needed for plane take off: %.2f%n",
                minimumRunwayLength);

    }

}
