import java.util.StringTokenizer;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[110][110];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int re = 0, n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());
        while(n-->0){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int[] a = new int[4];
            for(int i = 0; i<4; i++)
                a[i] = Integer.parseInt(st2.nextToken());
            for(int i = a[1]; i<=a[3]; i++)
                for(int j = a[0]; j<=a[2]; j++)
                    arr[i][j]++;
        }
        for(int i = 1; i<101; i++)
            for(int j = 1; j<101; j++)
                re = arr[i][j]>m?re+1:re;
        System.out.print(re);
    }

}