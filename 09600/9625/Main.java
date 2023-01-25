import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        int[] dp = new int[k+5];
        dp[1] = 1;
        for(int i = 2; i<=k; i++)
            dp[i] = dp[i-1]+dp[i-2];
        System.out.print(dp[k-1] + " " + dp[k]);
    }

}