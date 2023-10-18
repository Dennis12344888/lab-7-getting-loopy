import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        do {
            System.out.print("Enter temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Fahrenheit: " + fahrenheit);
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        } while (true);

        scanner.close();
    }
}
