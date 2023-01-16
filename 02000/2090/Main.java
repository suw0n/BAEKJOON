import java.util.StringTokenizer;
import java.io.*;

public class Main {

    static long f(long a, long b){
        return b==0?a:f(b, a%b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long a, b = 1, k;
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        for(int i = 1; i<n; i++){
            k = Integer.parseInt(st.nextToken());
            long m = a*k/f(a, k);
            b = m/a*b+m/k;
            a = m;
        }
        long c = f(a, b);
        System.out.print(a/c + "/" + b/c);
    }

}