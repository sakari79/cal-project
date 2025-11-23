import java.util.Scanner;

public class sachini {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("===== SIMPLE CALCULATOR =====");
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Choose operation (+, -, *, /): ");
            char op = scanner.next().charAt(0);

            double result = 0;
            boolean valid = true;

            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error! Division by zero.");
                        valid = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("Invalid Operation!");
                    valid = false;
            }

            if (valid) {
                System.out.println("Result: " + result);
            }

            System.out.print("Do you want to calculate again? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Calculator Closed. Thank you!");
        scanner.close();
    }
}
