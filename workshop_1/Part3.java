package workshop_1;

import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of list: ");
        int n = Integer.parseInt(scanner.nextLine());
        String[] listName = new String[n];
        System.out.println("Input list of name: ");
        for (int i = 0; i < n; i++) {
            listName[i] = scanner.nextLine();
        }
        System.out.println("List of student: ");
        for (int i = 0; i < n; i++) {
            System.out.println(listName[i].toUpperCase());;
        }
    }
}
