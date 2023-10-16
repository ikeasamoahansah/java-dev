import java.util.Scanner;

public class pytha {

    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value for x:");
        x = scanner.nextDouble();

        System.out.println("Enter a value for y:");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));
        System.out.println("The answer is: "+z);

        scanner.close();
    }
}