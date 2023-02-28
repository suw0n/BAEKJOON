import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine()), n, i;
        long sum, a, b;
        PriorityQueue<Long> que = new PriorityQueue<>();
        StringTokenizer st;
        while(t-->0) {
            que.clear();
            n = Integer.parseInt(br.readLine());
            sum = 0;
            st = new StringTokenizer(br.readLine());
            for(i = 0; i<n; i++) {
                que.add(Long.parseLong(st.nextToken()));
            }
            for(i = 1; i<n; i++) {
                a = que.poll();
                b = que.poll();
                que.add(a+b);
                sum += a+b;
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }

}