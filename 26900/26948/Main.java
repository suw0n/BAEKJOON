import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+5];
        dp[0] = dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i<=n; i++)
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        System.out.print(dp[n]);
    }

}