import java.util.StringTokenizer;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = 0 ,b = 0;
        for(int i = 1; i<n; i++)
            a+=i;
        for(int i = 0; i<n; i++)
            b+=Integer.parseInt(st.nextToken());
        System.out.print(b-a);
    }

}