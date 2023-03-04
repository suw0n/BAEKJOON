import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        int n, m, centi, t, i = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        centi = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());
        while(n-->0) {
            que.add(Integer.parseInt(br.readLine()));
        }
        if(centi>que.peek()) {
            System.out.print("YES\n" + i);
            return ;
        }
        for(; i<t; i++) {
            m = que.poll();
            if(m>1) {
                m/=2;
            }
            que.add(m);
            if(centi>que.peek()) {
                System.out.print("YES\n" + (i+1));
                return ;
            }
        }
        System.out.print(centi>que.peek() ? ("YES\n" + i) : ("NO\n" + que.peek()));
    }

}