package Calculator;
import java.util.Scanner;

// --- Operation Classes ---
class Addition {
    public int add(int a, int b) {
        return a + b;
    }
}

class Subtraction {
    public int subtract(int a, int b) {
        return a - b;
    }
}

class Multiplication {
    public int multiply(int a, int b) {
        return a * b;
    }
}

class Division {
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return (double) a / b;
    }
}

// --- Main Calculator ---
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Addition addObj = new Addition();
        Subtraction subObj = new Subtraction();
        Multiplication mulObj = new Multiplication();
        Division divObj = new Division();

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Choose operation: +  -  *  /");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result: " + addObj.add(num1, num2));
                break;
            case '-':
                System.out.println("Result: " + subObj.subtract(num1, num2));
                break;
            case '*':
                System.out.println("Result: " + mulObj.multiply(num1, num2));
                break;
            case '/':
                System.out.println("Result: " + divObj.divide(num1, num2));
                break;
            default:
                System.out.println("Invalid operation!");
        }

        sc.close();
    }
}
