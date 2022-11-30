import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> q = new PriorityQueue<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        for(int i = 0; i<n; i++)
            q.add(Integer.parseInt(st2.nextToken()));
        for(int i = 0; i<m; i++)
            q.add(Integer.parseInt(st3.nextToken()));
        for(int i = 0; i<n+m; i++)
            sb.append(q.poll()+" ");
        System.out.print(sb);
    }

}