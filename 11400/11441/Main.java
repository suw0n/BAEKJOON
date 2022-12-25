import java.util.StringTokenizer;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i<=n; i++)
            arr[i] = Integer.parseInt(st.nextToken())+arr[i-1];
        int m = Integer.parseInt(br.readLine());
        while(m-->0){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int[] ij = new int[2];
            for(int i = 0; i<2; i++)
                ij[i] = Integer.parseInt(st2.nextToken());
            System.out.println(arr[ij[1]]-arr[ij[0]-1]);
        }
    }

}