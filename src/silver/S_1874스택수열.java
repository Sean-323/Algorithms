package silver;

import java.util.Scanner;
import java.util.Stack;

public class S_1874스택수열 {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        // 입력
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        // 로직
        int num = 1;

        for (int su : A) {
            if (su >= num) {
                while (su >= num) {
                    stack.push(num++);
                    sb.append("+").append("\n");
                }
                stack.pop();
                sb.append("-").append("\n");
            } else {
                int n = stack.pop();
                if (n > su) {
                    sb.setLength(0);
                    sb.append("NO");
                    break;
                } else {
                    sb.append("-").append("\n");
                }
            }
        }

        // 출력
        System.out.println(sb.toString());
    }

}