import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        for(int i = 0; i<n; i++){
            int cnt = 0;
            for(int j = 0; j<i; j++)
                cnt = arr[i]>arr[j]||arr[i]==arr[j]?cnt+1:cnt;
            for(int j = i+1; j<n; j++)
                cnt = arr[i]>arr[j]?cnt+1:cnt;
            System.out.print(cnt + " ");
        }
    }

}