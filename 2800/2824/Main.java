import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

import static java.math.BigInteger.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        BigInteger c;

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) {
            c = new BigInteger(st1.nextToken());
            a = a.multiply(c);
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i<m; i++) {
            c = new BigInteger(st2.nextToken());
            b = b.multiply(c);
        }

        c = a.gcd(b);
        if(c.compareTo(valueOf(99999999))==1){
            BigInteger[] arr = new BigInteger[9];
            for(int i = 8; i>=0; i--) {
                arr[i] = c.mod(valueOf(10));
                c = c.divide(valueOf(10));
            }
            for(int i = 0; i<9; i++)
                System.out.print(arr[i]);
        }
        else
            System.out.print(c);
    }

}