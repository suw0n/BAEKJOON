import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x, y, cnt = 0, i = 0, n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(i = 0; i<n; i++)
            a[i] = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st2.nextToken());
        y = Integer.parseInt(st2.nextToken());
        for(i = 0; i<n; i++)
            cnt = a[i]>=y?cnt+1:cnt;
        System.out.print(n*x/100 + " " + cnt);
    }

}