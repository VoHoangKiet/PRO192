package workshop_2;

import java.util.Scanner;

public class Part_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        String pattern = "SE\\d{3}";
        do {
            try {
                System.out.print("Input the string: ");
                input = scanner.nextLine();

                if (input.matches(pattern)) {
                    System.out.println("The string is " + input);
                } else {
                    System.out.println("The string is invalid");
                }
            } catch (Exception e) {
                System.out.println("The string is invalid");
                input = "";
            }
        } while (input.isEmpty());
    }
}
