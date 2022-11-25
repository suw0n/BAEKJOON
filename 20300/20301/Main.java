import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<Integer> d = new ArrayDeque<>();
        int a = 0, b = 0, n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int i = 1; i<=n; i++)
            d.add(i);
        while(!d.isEmpty()){
            for(int i = 1; i<k; i++){
                if(a==0)
                    d.add(d.poll());
                else
                    d.addFirst(d.pollLast());
            }
            System.out.println(a==0?d.poll():d.pollLast());
            if(++b==m){
                a = a==0?1:0;
                b = 0;
            }
        }
    }
    
}