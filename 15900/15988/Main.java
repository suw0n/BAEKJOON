import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static long[] dp = new long[1000010];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i = 4; i<=1000000; i++)
            dp[i] = (dp[i-1]+dp[i-2]+dp[i-3])%1000000009;
        while(t-->0)
            System.out.println(dp[Integer.parseInt(br.readLine())]);
    }

}