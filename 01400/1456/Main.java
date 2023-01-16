import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int re = 0, len = 0;
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        int x = (int)Math.sqrt(b);
        boolean[] arr = new boolean[x+10];
        List<Integer> list = new ArrayList<>();

        for(int i = 2; i*i<=x; i++)
            for(int j = 2; i*j<=x; j++)
                arr[i*j] = true;

        for(int i = 2; i<=x; i++) {
            if (!arr[i]) {
                list.add(i);
                len++;
            }
        }

        for(int i = 0; i<len; i++){
            int m = list.get(i);
            for(long j = (long)m*m; j<=b;){
                re = a<=j?re+1:re;
                if(j<=100000000000000L/m)
                    j*=m;
                else
                    break;
            }
        }
        System.out.print(re);
    }

}