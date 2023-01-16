import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = 2000000001, n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        for(int i = 0; i<n-1; i++){
            int l = i, r = n-1;
            while(l<=r){
                int mid = (l+r)/2;
                int sum = arr[mid]-arr[i];
                if(sum>=m&&sum<min)
                    min = sum;
                if(sum>m)
                    r = mid-1;
                else
                    l = mid+1;
            }
        }
        System.out.print(min);
    }

}