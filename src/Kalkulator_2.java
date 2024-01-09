import java.util.Scanner;

public class Kalkulator_2 {
    private int number1;
    private int number2;

    // Constructor
    public Kalkulator_2(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // Getter for number1
    public int getNumber1() {
        return number1;
    }

    // Setter for number1
    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    // Getter for number2
    public int getNumber2() {
        return number2;
    }

    // Setter for number2
    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    // Method to calculate the sum
    public int calculateSum() {
        return number1 + number2;
    }

    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the numbers
        System.out.print("Enter Number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter Number 2: ");
        int num2 = scanner.nextInt();

        // Creating an instance of Calculator
        Kalkulator_2 calculator = new Kalkulator_2(num1, num2);

        // Printing the initial values
        System.out.println("Number 1: " + calculator.getNumber1());
        System.out.println("Number 2: " + calculator.getNumber2());

        // Calculating and printing the sum
        System.out.println("Sum: " + calculator.calculateSum());

        // Updating the numbers using setters
        System.out.print("Enter Updated Number 1: ");
        calculator.setNumber1(scanner.nextInt());

        System.out.print("Enter Updated Number 2: ");
        calculator.setNumber2(scanner.nextInt());

        // Printing the updated values
        System.out.println("Updated Number 1: " + calculator.getNumber1());
        System.out.println("Updated Number 2: " + calculator.getNumber2());

        // Calculating and printing the sum after the update
        System.out.println("Updated Sum: " + calculator.calculateSum());

        // Closing the scanner
        scanner.close();
    }
}
