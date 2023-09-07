import java.util.Scanner;

public class ToolSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctUsername = "Prayash";
        String correctPassword = "Prayash123";

        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
            System.out.println("Login successful!");

            System.out.println("Choose a tool:");
            System.out.println("1. Calculator");
            System.out.println("2. Guessing Game");
            System.out.println("3. Simple Interest Calculator");
            System.out.println("4. Vowel Consonant Check");

            int selectedTool = scanner.nextInt();

            switch (selectedTool) {
                case 1:
                    System.out.println("Calculator");
                    System.out.print("Enter num1: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter num2: ");
                    double num2 = scanner.nextDouble();
                    System.out.print("Enter operator (+, -, *, /): ");
                    char operator = scanner.next().charAt(0);

                    double result = 0;

                    switch (operator) {
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

                                result = num1 / num2;

                            break;
                        default:
                            System.out.println("Invalid operator");
                    }
                    System.out.println("Result: " + result);
                    break;

                case 2:
                    System.out.println("Guessing Game");
                    break;

                case 3:
                    System.out.println("Simple Interest Calculator");
                    System.out.print("Enter Principal amount: ");
                    double principal = scanner.nextDouble();
                    System.out.print("Enter Time (in years): ");
                    double time = scanner.nextDouble();
                    System.out.print("Enter Rate of interest: ");
                    double rate = scanner.nextDouble();

                    double simpleInterest = (principal * time * rate) / 100;
                    System.out.println("Simple Interest: " + simpleInterest);
                    break;

                case 4:
                    System.out.println("Vowel Consonant Check");
                    System.out.print("Enter a character: ");
                    char inputChar = scanner.next().charAt(0);

                    if (Character.isLetter(inputChar)) {
                        inputChar = Character.toLowerCase(inputChar);
                        if (inputChar == 'a' || inputChar == 'e' || inputChar == 'i' || inputChar == 'o' || inputChar == 'u') {
                            System.out.println(inputChar + " is a vowel.");
                        } else {
                            System.out.println(inputChar + " is a consonant.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a letter.");
                    }
                    break;

                default:
                    System.out.println("Invalid tool selection");
            }
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
