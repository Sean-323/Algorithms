package bronze;

import java.util.Scanner;

public class B_2753윤년 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        System.out.println((A % 400 == 0 || (A % 4 == 0 && A % 100 != 0)) ? 1 : 0);
    }

}
