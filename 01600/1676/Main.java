import java.math.BigInteger;
import java.io.*;

public class Main {

    static int f(int n){
        int re = 0;
        BigInteger m = new BigInteger("1");
        for(int i = 1; i<=n; i++)
            m = m.multiply(BigInteger.valueOf(i));
        while(m != BigInteger.ZERO){
            if(m.mod(BigInteger.valueOf(10)) != BigInteger.ZERO)
                break;
            m = m.divide(BigInteger.valueOf(10));
            re++;
        }
        return n==0?n:re;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.print(f(n));
    }

}