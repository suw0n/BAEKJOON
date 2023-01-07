import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int min, n = Integer.parseInt(br.readLine());
        min = 2147483647;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        for(int i = 0; i<n-1; i++){
            int l = i+1, r = n-1;
            while(l<=r){
                int mid = (l+r)/2;
                int sum = arr[i]+arr[mid];
                min = Math.abs(min)>Math.abs(sum)?sum:min;
                if(arr[mid]<-arr[i])
                    l = mid+1;
                else
                    r = mid-1;
            }
        }
        System.out.print(min);
    }

}