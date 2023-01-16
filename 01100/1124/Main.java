import java.util.*;
import java.io.*;

public class Main {
    static int[] arr = new int[100010];
    static boolean f(int n){
        int cnt = 0;
        while(n != 1){
            for(int i = 2; i<=n; i++) {
                if (arr[i] == 0 && n % i == 0) {
                    n /= i;
                    break;
                }
            }
            cnt++;
        }
        return arr[cnt]==0?true:false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int re = 0;
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        arr[1] = 1;
        for(int i = 2; i*i<=b; i++)
            for(int j = 2; i*j<=b; j++)
                arr[i*j] = 1;

        for(int z = a; z<=b; z++)
            if(f(z))
                re++;
        System.out.println(re);
    }

}