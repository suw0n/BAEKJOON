import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int[] nm = new int[3];
        for(int i = 0; i<2; i++)
            nm[i] = Integer.parseInt(br.readLine());
        for(int i = 1; i<nm[0]; i++)
            queue.add(Integer.parseInt(br.readLine()));
        while(nm[0]>1 && nm[1]<=queue.peek()){
            nm[2]++;
            nm[1]++;
            queue.add(queue.poll()-1);
        }
        System.out.print(nm[2]);
    }

}