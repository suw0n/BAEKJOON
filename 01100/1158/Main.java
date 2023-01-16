import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        for(int i = 1; i<=n; i++)
            q.add(i);
        System.out.print("<");
        while(q.size()>1){
            for(int i = 1; i<k; i++)
                q.add(q.poll());
            System.out.print(q.poll() + ", ");
        } 
        System.out.print(q.poll() + ">");
    }

}