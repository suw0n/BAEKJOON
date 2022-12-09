import java.util.StringTokenizer;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            int m = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens())
                m+=Integer.parseInt(st.nextToken());
            System.out.println(m);
        }
    }

}