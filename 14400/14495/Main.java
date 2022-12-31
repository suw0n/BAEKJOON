import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[n+5];
        dp[1] = dp[2] = dp[3] = 1;
        for(int i = 4; i<=n; i++)
            dp[i] = dp[i-1]+dp[i-3];
        System.out.print(dp[n]);
    }

}