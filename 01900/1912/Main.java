import java.util.StringTokenizer;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dp = new int[n];
        for(int i = 0; i<n; i++)
            dp[i] = Integer.parseInt(st.nextToken());
        for(int i = 1; i<n; i++)
            if(dp[i-1]>0)
                dp[i]+=dp[i-1];
        int max = dp[0];
        for(int i = 1; i<n; i++)
            max = dp[i]>max?dp[i]:max;
        System.out.println(max);
    }

}