import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int re = 0, n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++)
                q.add(Integer.parseInt(st.nextToken()));
        }
        for(int i = 0; i<n; i++)
            re = q.remove();
        System.out.print(re);
    }

}