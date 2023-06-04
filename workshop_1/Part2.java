package workshop_1;

import java.util.Scanner;

public class Part2 {
    public static void display(String op, float a, float b, float rs) {
        System.out.printf("The result of %.1f "+op+" %.1f = "+rs,a,b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number 1: ");
        float a = Float.parseFloat(scanner.nextLine());
        System.out.print("Input number 1: ");
        float b = Float.parseFloat(scanner.nextLine());
        System.out.print("Input operator: ");
        String op = scanner.nextLine();
        switch (op) {
            case "+":
                display(op,a,b,a+b);
                break;
            case "-":
                display(op,a,b,a-b);
                break;
            case "*":
                display(op,a,b,a*b);
                break;
            case "/":
                display(op,a,b,a/b);
                break;
            default:
                System.out.println("Wrong operator !");
        }
    }
}
