import java.util.StringTokenizer;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        dp1[0] = dp2[0] = 1;
        for(int i = 1; i<n; i++){
            dp1[i] = arr[i]>=arr[i-1]?dp1[i-1]+1:1;
            dp2[i] = arr[i]<=arr[i-1]?dp2[i-1]+1:1;
        }
        int m1 = dp1[0], m2 = dp2[0];
        for(int i = 1; i<n; i++){
            m1 = m1<dp1[i]?dp1[i]:m1;
            m2 = m2<dp2[i]?dp2[i]:m2;
        }
        System.out.print(m1>m2?m1:m2);
    }

}