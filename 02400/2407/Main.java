import java.util.StringTokenizer;
import java.math.BigInteger;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        BigInteger p = new BigInteger("1");
        BigInteger f = new BigInteger("1");
        for(int i = n; i>n-m; i--)
            p = p.multiply(BigInteger.valueOf(i));
        for(int i = 2; i<=m; i++)
            f = f.multiply(BigInteger.valueOf(i));
        System.out.print(p.divide(f));
    }

}