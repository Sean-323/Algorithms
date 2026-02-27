package silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S_2164카드2 {

    public static void main(String[] args)  {
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) queue.add(i);

        // 로직
        while (queue.size() > 1) {
            queue.poll();
            queue.add(queue.poll());
        }

        // 출력
        System.out.println(queue.poll());
    }

}