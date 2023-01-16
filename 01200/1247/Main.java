import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int z = 0; z<3; z++){
            BigInteger m = new BigInteger("0");
            int re, n = Integer.parseInt(br.readLine());
            for(int i = 0; i<n; i++){
                BigInteger l = new BigInteger(br.readLine());
                m = m.add(l);
            }
            re = m.compareTo(BigInteger.ZERO);
            System.out.println(re==0?"0":re>0?"+":"-");

        }
    }

}