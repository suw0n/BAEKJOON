import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        Queue<String> q = new LinkedList<>();
        String s;
        
        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens())
                q.add(st.nextToken());
            while(q.size() != 1){
                s = q.poll();
                for(int i = s.length()-1; i>=0; i--)
                    sb.append(s.charAt(i));
                sb.append(" ");
            }
            s = q.poll();
            for(int i = s.length()-1; i>=0; i--)
                sb.append(s.charAt(i));
            sb.append("\n");
        }
        System.out.print(sb);
    }

}