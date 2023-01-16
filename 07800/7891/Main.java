import java.util.StringTokenizer;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n  = Integer.parseInt(br.readLine());
        while(n-->0){
            int re = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i<2; i++)
                re+=Integer.parseInt(st.nextToken());
            System.out.println(re);
        }
    }

}