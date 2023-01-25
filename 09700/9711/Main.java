import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static long[] dp = new long[10010];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine()), i = 0;
        while(i++<t){
            String[] s = br.readLine().split(" ");
            int p = Integer.parseInt(s[0]), q = Integer.parseInt(s[1]);
            dp[1] = 1;
            for(int j = 2; j<=p; j++)
                dp[j] = (dp[j-1]+dp[j-2])%q;
            sb.append("Case #" + i + ": " + dp[p]%q + "\n");
        }
        System.out.print(sb);
    }

}