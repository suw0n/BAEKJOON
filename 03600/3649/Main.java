import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int k, n, l, r, sum, i, m;
        String s;
        while((s = br.readLine())!=null) {
            k = Integer.parseInt(s)*10000000;
            n = Integer.parseInt(br.readLine());
            m = l = 0;
            r = n-1;
            arr = new int[n];
            for(i = 0; i<n; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            if(n<2) {
                sb.append("danger").append("\n");
                m = -1;
            }
            Arrays.sort(arr);
            while(l<r && m==0) {
                sum = arr[l]+arr[r];
                if(sum==k) {
                    sb.append("yes " + arr[l] + " " + arr[r]).append("\n");
                    m = 1;
                } else if(sum<k) {
                    l++;
                } else {
                    r--;
                }
            }
            if(m==0) {
                sb.append("danger").append("\n");
            }
        }
        System.out.print(sb);
    }

}