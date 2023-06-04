package workshop_1;

import java.util.Scanner;


public class Part1 {
    public static int sumArr(int[][] arr, int n, int m) {
        int s = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                s += arr[i][j];
            }
        }
        return s;
    }

    public static double avgArr(int[][] arr, int n, int m) {
        return ((double) sumArr(arr, n, m)) / (n * m);
    }

    public static void display(int[][] arr, int n, int m) {
        System.out.println("Ma trận đã nhập: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số cột: ");
        int m = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhập m[" + i + "][" + j + "] : ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        display(arr, n, m);
        System.out.println("Tổng: " + sumArr(arr, n, m));
        System.out.println("Trung bình: " + avgArr(arr, n, m));
    }
}
