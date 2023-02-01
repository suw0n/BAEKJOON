import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), m, sum = 0;
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        m = (int)Math.round((double)n*15.0/100.0);
        for(int i = 0+m; i<n-m; i++)
            sum+=arr[i];
        sum = Math.round(sum);
        int k = n-(2*m);
        System.out.print(Math.round((double)sum/(double)k));
    }

}