import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Long> q = new PriorityQueue<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        long l, re = 0;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        while(n-->0)
            q.add(Long.parseLong(st2.nextToken()));

        while(m-->0){
            l = q.poll() + q.poll();
            q.add(l);
            q.add(l);
        }
        while(!q.isEmpty())
            re += q.poll();
        System.out.print(re);
    }

}