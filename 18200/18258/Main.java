import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> d = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            if("push".equals(st.nextToken()))
                d.push(Integer.parseInt(st.nextToken()));
            else if("pop".equals(s))
                sb.append((d.isEmpty()?-1:d.pollLast())+"\n");
            else if("size".equals(s))
                sb.append(d.size()+"\n");
            else if("empty".equals(s))
                sb.append((d.isEmpty()?1:0)+"\n");
            else if("front".equals(s))
                sb.append((d.isEmpty()?-1:d.peekLast())+"\n");
            else
                sb.append((d.isEmpty()?-1:d.peek())+"\n");
        }
        System.out.print(sb);
    }

}