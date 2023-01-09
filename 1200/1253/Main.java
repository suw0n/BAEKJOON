import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int binary(int[] arr, int l, int r, int t, int z){
        while(l<r){
            l = l==z?l+1:l;
            r = r==z?r-1:r;
            int sum = arr[l]+arr[r];
            if(sum==t && l!=r)
                return 1;
            l = sum<t?l+1:l;
            r = sum>t?r-1:r;
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), re = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        for(int z = 0; z<n; z++){
            int m = binary(arr, 0, n-1, arr[z], z);
            re = m==1?re+1:re;
        }
        System.out.print(re);
    }

}