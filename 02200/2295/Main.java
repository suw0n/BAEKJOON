import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static int[] arr;

    static boolean binary(int l, int r, int z, long k) {
        while(l<=r) {
            long sum = z+arr[l]+arr[r];
            if(sum==k) {
                return true;
            } else if(sum<k) {
                l++;
            } else {
                r--;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int i = n-1; i>=0; i--) {
            for(int j = 0; j<n; j++) {
                if(binary(0, n-1, arr[j], arr[i])) {
                    System.out.print(arr[i]);
                    return ;
                }
            }
        }

    }

}