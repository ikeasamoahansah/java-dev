import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        age = scanner.nextInt();

        if (age%15 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (age%3 == 0) {
            System.out.println("Fizz");
        }
        else if (age%5 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println("You're okay");
        }

        scanner.close();
    }
}