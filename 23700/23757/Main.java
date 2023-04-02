import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        int n, m, k, re = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        while (n-->0) {
            que.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        while (m-->0) {
            k = Integer.parseInt(st.nextToken());
            if(k>que.peek()) {
                re = 0;
                break;
            } else {
                que.add(que.poll()-k);
            }
        }
        System.out.print(re);
    }

}