package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S_1940주몽 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] ingredients = new int[N];
        for (int i = 0; i < N; i++) ingredients[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(ingredients);

        int count = 0;
        int startIdx = 0;
        int endIdx = N - 1;

        while (startIdx < endIdx) {
            int sum = ingredients[startIdx] + ingredients[endIdx];
            if (sum == M) {
                count++;
                endIdx--;
                startIdx++;
            } else if (sum < M) startIdx++;
            else endIdx--;
        }
        System.out.println(count);
    }
}