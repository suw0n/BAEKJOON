import java.util.StringTokenizer;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(br.readLine());
        long sum = 0, xor = 0;
        while(m-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if("1".equals(s)||"2".equals(s)){
                Long n = Long.parseLong(st.nextToken());
                sum+="1".equals(s)?n:-n;
                xor^=n;
            }
            else
                sb.append("3".equals(s)?sum:xor).append("\n");
        }
        System.out.print(sb);
    }

}