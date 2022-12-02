import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if(n==0)
            System.out.print(0+"\n"+0);
        else{
            int[] dp = new int[n<0?n*-1+1:n+1];
            dp[1] = 1;
            if(n>0)
                for(int i = 2; i<=n; i++)
                    dp[i] = (dp[i-1]+dp[i-2])%1000000000;
            else {
                n*=-1;
                for(int i = 2; i<=n; i++)
                    dp[i] = (dp[i-2]-dp[i-1])%1000000000;
            }
            System.out.println(dp[n]>0?1:dp[n]==0?0:-1);
            System.out.print((dp[n]>0?dp[n]:dp[n]*-1)%1000000000);
        }
    }

}