import java.util.Scanner;
import java.text.DecimalFormat;

public class SciCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        double result = 0.0;                            // Initialize variables outside the while loop
        int operation;
        int numCalculations = 0;
        double sumResults = 0;


        do {
            System.out.println();
            System.out.println("Current Result: " + result);
            System.out.println();
            System.out.println("Calculator Menu");          // Calculator Menu to select from including new options
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average");
            System.out.println();

            do {
                System.out.print("Enter Menu Selection: ");       // Asking for which option while entering another loop for case 7.
                operation = scanner.nextInt();

                if (operation == 0) {                       // Exit Program
                    System.out.println();
                    System.out.println("Thanks for using this calculator. Goodbye!");
                    break;
                } else if (operation >= 1 && operation <= 6) {
                    System.out.print("Enter first operand: ");      // User enters the first operand
                    double firstOperand = scanner.nextDouble();

                    System.out.print("Enter second operand: ");     // User enters second operand
                    double secondOperand = scanner.nextDouble();

                    switch (operation) {                        // Depending on the operation entered, it will lead to an expression.
                        case 1:
                            result = firstOperand + secondOperand;              // Addition
                            numCalculations++;
                            sumResults += result;
                            break;
                        case 2:
                            result = firstOperand - secondOperand;              // Subtraction
                            numCalculations++;
                            sumResults += result;
                            break;
                        case 3:
                            result = firstOperand * secondOperand;              // Multiplication
                            numCalculations++;
                            sumResults += result;
                            break;
                        case 4:
                            result = firstOperand / secondOperand;              // Division
                            numCalculations++;
                            sumResults += result;
                            break;
                        case 5:
                            result = Math.pow(firstOperand, secondOperand);             // Exponent
                            numCalculations++;
                            sumResults += result;
                            break;
                        case 6:
                            result = Math.log(secondOperand) / Math.log(firstOperand);      // Logarithm
                            numCalculations++;
                            sumResults += result;
                            break;
                    }
                } else if (operation == 7) {                        // Display Average
                    System.out.println();
                    if (numCalculations == 0) {                     // An if statement on whether the person has made any calculations so far.
                        System.out.println("Error: No calculations yet to average!");
                        System.out.println();
                    } else if (numCalculations != 0) {
                        System.out.println("Sum of calculations: " + sumResults);
                        System.out.println("Number of calculations: " + numCalculations);
                        double avgCalculations = (sumResults / numCalculations);
                        System.out.println("Average of calculations: " + df.format(avgCalculations));
                        System.out.println();
                    }
                } else {                                    // Any operation that is not 1 through 7.
                    System.out.println();
                    System.out.println("Error: Invalid selection!");
                    System.out.println();
                }
            } while (operation < 0 || operation >= 7);
        } while (operation != 0);
    }
}