import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), m = 0, i, j, k;
        for(i = 3; i<=n; i+=3) {
            for(j = 3; j<=n; j+=3) {
                k = n-i-j;
                if(k>2 && k%3==0) {
                    m++;
                }
            }
        }
        System.out.print(m);
    }

}