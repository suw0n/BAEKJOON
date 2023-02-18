import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Double> que = new PriorityQueue<>();
        int n = Integer.parseInt(br.readLine()), i;
        double m;
        for(i = 0; i<n; i++) {
            que.add(Double.parseDouble(br.readLine()));
        }
        for(i = 1; i<n; i++) {
            m = (que.poll()+que.poll())/2;
            que.add(m);
        }
        System.out.printf("%.6f", que.peek());
    }

}