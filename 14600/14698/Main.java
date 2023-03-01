import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Long> que;
        int t = Integer.parseInt(br.readLine()), n, i;
        long m, k;
        StringTokenizer st;
        while(t-->0) {
            que = new PriorityQueue<>();
            n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            m = i = 1;
            for(; i<=n; i++) {
                que.add(Long.parseLong(st.nextToken()));
            }
            while(que.size()>1) {
                k = que.poll()*que.poll();
                que.add(k);
                m = (m*(k%1000000007))%1000000007;
            }
            sb.append(m).append("\n");
        }
        System.out.print(sb);
    }

}