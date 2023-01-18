import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long m = 2;
        long[] dp = new long[n+5];
        dp[1] = dp[2] = 1;
        for(int i = 3; i<=n; i++)
            m+=(dp[i]= dp[i-1]+dp[i-2]);
        System.out.print(n==1?4:2*(m+1));
    }

}