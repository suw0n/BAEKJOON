import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), m = 0, k = 0, i = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(; i<n; i++) {
            if(Integer.parseInt(st.nextToken())==k) {
                k = (k+1)%3;
                m++;
            }
        }
        System.out.print(m);
    }

}