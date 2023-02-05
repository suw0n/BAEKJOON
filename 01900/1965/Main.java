import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0, n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i<n; i++) {
            int cnt = 0;
            for(int j = i-1; j>=0; j--) {
                if(arr[j]<arr[i] && dp[j]>cnt) {
                    cnt = dp[j];
                }
            }
            dp[i] = cnt+1;
            max = dp[i]>max?dp[i]:max;
        }
        System.out.print(max);
    }

}