import java.util.StringTokenizer;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int re = 0, n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            for(int i = n; i<=m; i++){
                int tmp = i;
                if(i==0)
                    re++;
                while(tmp != 0){
                    if(tmp%10==0)
                        re++;
                    tmp/=10;
                }
            }
            sb.append(re+"\n");
        }
        System.out.print(sb);
    }

}