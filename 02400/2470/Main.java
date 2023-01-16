import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a, b, min, n = Integer.parseInt(br.readLine());
        a = b = min = 2147483647;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        for(int i = 0; i<n-1; i++){
            int l = i+1, r = n-1;
            while(l<=r){
                int mid = (l+r)/2;
                int sum = Math.abs(arr[i]+arr[mid]);
                if(min>sum){
                    min = sum;
                    a = arr[i];
                    b = arr[mid];
                }
                if(arr[mid]<-arr[i])
                    l = mid+1;
                else
                    r = mid-1;
                if(min==0){
                    i = n;
                    l = r+1;
                }
            }
        }
        System.out.print(a + " " + b);
    }

}