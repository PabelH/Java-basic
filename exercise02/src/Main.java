
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number: ");

        int number = scanner.nextInt();

        double tax = number * 0.2;

        double sum = number + tax;

        System.out.println("The total price is: " + sum);
    }
}