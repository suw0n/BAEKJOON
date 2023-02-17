import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;

    static int binary(int l, int r, int k) {
        int m = -1;
        while (l<=r) {
            m = (l+r)/2;
            if(arr[m]==k) {
                return m;
            } else if(arr[m]<k) {
                l = m+1;
            } else {
                r = m-1;
            }
        }
        return k<arr[m]?m-1:m;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[n+1];
        for(int i = 1; i<=n; i++) {
            arr[i] = arr[i-1]+Integer.parseInt(st.nextToken());
        }
        while(m-->0) {
            sb.append(binary(1, n, Integer.parseInt(br.readLine()))).append("\n");
        }
        System.out.print(sb);
    }

}