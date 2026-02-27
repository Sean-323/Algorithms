package bronze;

import java.util.Scanner;

public class B_10950A_B_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            sb.append(A + B).append("\n");
        }
        System.out.println(sb);
    }

}
