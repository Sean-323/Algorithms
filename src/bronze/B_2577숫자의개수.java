package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2577숫자의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int[] arr = new int[10];

        int result = A * B * C;
        String temp = String.valueOf(result);
        for (int i = 0; i < temp.length(); i++) arr[temp.charAt(i) - '0']++;

        for (int a : arr) System.out.println(a);
    }
}
