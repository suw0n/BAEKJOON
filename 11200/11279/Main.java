import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            int m = Integer.parseInt(br.readLine());
            if(m==0)
                System.out.println(q.isEmpty()?0:q.poll());
            else
                q.add(m);
        }
    }

}