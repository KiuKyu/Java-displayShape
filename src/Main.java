import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("1. Print a rectangle");
        System.out.println("2. Print a square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.print("Enter a choice: ");
        int choice = -1;
        String output = "";
        choice = userInput.nextInt();
            switch (choice) {
                case 1: {
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            output += "*";
                        }
                        output += "\n";
                    }
                    System.out.print(output);
                    break;
                }
                case 2: {
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            output += "*";
                        }
                        output += "\n";
                    }
                    System.out.print(output);
                    break;
                }
                case 3: {
                    for (int i = 5; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            output += "*";
                        }
                        output += "\n";
                    }
                    System.out.print(output);
                    break;
                }
                default: {
                    System.out.println("Không có giá trị này");
                    break;
                }
            }
    }
}
