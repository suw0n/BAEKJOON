import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        BigInteger[] dp = new BigInteger[251];
        dp[0] = dp[1] = BigInteger.ONE;
        for(int i = 2; i<=250; i++)
            dp[i] = dp[i-1].add(dp[i-2].multiply(BigInteger.TWO));
        String s;
        while((s = br.readLine())!=null)
            sb.append(dp[Integer.parseInt(s)] + "\n");
        System.out.print(sb);
    }

}