import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int re = 0, n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++)
            arr1[i] = Integer.parseInt(st1.nextToken());
        for(int i = 0; i<n; i++)
            arr2[i] = Integer.parseInt(st2.nextToken());
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = n-1;
        while(i<n)
            re += arr1[i++]*arr2[j--];
        System.out.print(re);
    }

}