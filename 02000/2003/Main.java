import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n, m, re = 0;
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i<n; i++) {
            int sum = 0, j = i;
            while(j<n) {
                sum+=arr[j];
                if(sum>=m) {
                    re = sum==m ? re+1 : re;
                    break;
                } else {
                    j++;
                }
            }
        }
        System.out.print(re);
    }

}