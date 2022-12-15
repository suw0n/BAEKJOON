import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int re = 0, n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++)
            q.add(Integer.parseInt(st.nextToken()));
        while(!q.isEmpty()){
            if(q.size()>1){
                int[] arr = new int[2];
                for(int i = 0; i<2; i++)
                    arr[i] = q.poll()-1;
                for(int i = 0; i<2; i++)
                    if(arr[i]!=0)
                        q.add(arr[i]);
                re++;
            }
            else
                re+=q.poll();
        }
        System.out.print(re>1440?-1:re);
    }

}