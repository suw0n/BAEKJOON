import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+5];
        dp[0] = dp[1] = 1;
        for(int i = 2; i<=n; i++)
            dp[i] = (dp[i-1]+dp[i-2]+1)%1000000007;
        System.out.print(dp[n]%1000000007);
    }

}