package bronze;

import java.util.Scanner;

public class B_2884알람시계 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        int total = H * 60 + M;
        total -= 45;

        if (total < 0) total += 1440;

        System.out.printf("%d %d", total / 60, total % 60);
    }
}
