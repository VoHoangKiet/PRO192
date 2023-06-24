package workshop_2;
import java.util.Scanner;

public class Part_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            try {
                System.out.print("Enter the number: ");
                String input = scanner.nextLine();

                number = Integer.parseInt(input);

                if (number < 1) {
                    System.out.println("The number is invalid");
                } else {
                    System.out.println("The number is " + number);
                }
            } catch (NumberFormatException e) {
                System.out.println("The number is invalid");
                number = -1;
            }
        } while (number < 1);
    }
}