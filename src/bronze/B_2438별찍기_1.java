package bronze;

import java.util.Scanner;

public class B_2438별찍기_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        for (int i = 1; i <= A; i++) {
            for (int j = 0; j <= i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
