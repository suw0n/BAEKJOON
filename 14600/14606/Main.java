import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+5];
        dp[2] = 1;
        for(int i = 3; i<=n; i++)
            dp[i] = dp[i-1]+i-1;
        System.out.print(dp[n]);
    }

}