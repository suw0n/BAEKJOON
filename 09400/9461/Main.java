import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long[] dp = new long[110];
        dp[1] = dp[2] = dp[3] = 1;
        for(int i = 4; i<101; i++)
            dp[i] = dp[i-2]+dp[i-3];
        int t = Integer.parseInt(br.readLine());
        while(t-->0)
            System.out.println(dp[Integer.parseInt(br.readLine())]);
    }

}