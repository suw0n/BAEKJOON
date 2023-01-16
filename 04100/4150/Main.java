import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    static BigInteger[] dp = new BigInteger[10000];
    public static BigInteger fibo(int a){
        if(a<2)
            return BigInteger.valueOf(a);
        else if(dp[a] != BigInteger.valueOf(0))
            return dp[a];
        return dp[a] = dp[a].add(fibo(a-1)).add(fibo(a-2));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n = Integer.parseInt(br.readLine());
        for(int i = 0; i<=n; i++)
            dp[i] = BigInteger.valueOf(0);
        System.out.println(fibo(n));

    }

}