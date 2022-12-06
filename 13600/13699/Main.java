import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[n+1];
        dp[0] = 1;
        for(int i = 1; i<=n; i++){
            long m = 0;
            for(int j = 0, k = i-1; j<i; j++, k--)
                m+=dp[j]*dp[k];
            dp[i] = m;
        }
        System.out.print(dp[n]);
    }

}