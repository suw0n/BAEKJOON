import java.util.*;
import java.io.*;

public class Main {

    static boolean[] arr = new boolean[9989900];

    static boolean f(int n){
        int i = 0, j, cnt = 0;
        int[] s = new int[15];
        while(n != 0){
            s[cnt++] = n%10;
            n/=10;
        }
        j = cnt-1;
        while(i<j)
            if(s[i++] != s[j--])
                return false;
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 2; i*i<=9989899; i++)
            for(int j = 2; i*j<=9989899; j++)
                arr[i*j] = true;
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        for(int i = a; i<=(b>9989899?9989899:b); i++)
            if(!arr[i] && f(i))
                sb.append(i + "\n");
        sb.append(-1);
        System.out.println(sb);
    }

}
