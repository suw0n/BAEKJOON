import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+5];
        dp[0] = 0;
        dp[1] = -1;
        dp[2] = 1;
        dp[3] = -1;
        dp[4] = 2;
        for(int i = 5; i<=n; i++) {
            if(dp[i-2]==-1 && dp[i-5]==-1) {
                dp[i] = -1;
            } else if(dp[i-2]==-1) {
                dp[i] = dp[i-5]+1;
            } else if(dp[i-5]==-1) {
                dp[i] = dp[i-2]+1;
            } else {
                dp[i] = Math.min(dp[i-2], dp[i-5])+1;
            }
        }
        System.out.print(dp[n]);
    }

}