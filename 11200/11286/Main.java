import java.util.*;
import java.io.*;

public class Main {

    static class Com implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            int a = Math.abs(o1);
            int b = Math.abs(o2);
            if(a!=b)
                return a>b?1:-1;
            else
                return o1==o2?0:o1>o2?1:-1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Com c = new Com();
        PriorityQueue<Integer> q = new PriorityQueue<>(c);
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            int m = Integer.parseInt(br.readLine());
            if(m==0)
                System.out.println(q.isEmpty()?0:q.remove());
            else
                q.add(m);
        }
    }

}