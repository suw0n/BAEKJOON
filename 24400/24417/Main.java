import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), a, b, c;
        a = b = c = 1;
        for(int i = 3; i<=n; i++){
            c = (a+b)%1000000007;
            a = b;
            b = c;
        }
        System.out.print(c + " " + (n-2));
    }

}