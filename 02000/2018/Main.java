import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), m = 0, sum, i = 1, j;
        for(; i<=n; i++) {
            sum = 0;
            for(j = i; 0<j&&j<=n;) {
                sum+=j;
                if(sum<n) {
                    j++;
                } else {
                    m = sum==n ? m+1 : m;
                    break;
                }
            }
        }
        System.out.print(m);
    }

}