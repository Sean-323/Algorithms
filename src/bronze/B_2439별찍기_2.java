package bronze;

import java.util.Scanner;

public class B_2439별찍기_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        for (int i = 1; i <= A; i++) {

            for (int j = 0; j < A - i; j++) System.out.print(" ");

            for (int j = 0; j < i; j++) System.out.print("*");

            System.out.println();
        }
    }
}