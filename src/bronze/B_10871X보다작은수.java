package bronze;

import java.util.Scanner;

public class B_10871X보다작은수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] arr = new int[A];
        for (int i = 0; i < A; i++) arr[i] = sc.nextInt();

        for (int j : arr) {
            if (j < B) sb.append(j + " ");
        }

        System.out.println(sb);
    }

}
