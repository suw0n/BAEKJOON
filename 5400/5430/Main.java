import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            Deque<Integer> d = new ArrayDeque<>();
            String f = br.readLine();
            int n = Integer.parseInt(br.readLine());
            int a = 0, c = 0, m = f.length();
            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
            for(int i = 0; i<n; i++)
                d.add(Integer.parseInt(st.nextToken()));

            for(int i = 0; i<m; i++){
                if('D'==f.charAt(i)){
                    if(d.isEmpty()){
                        a = 1;
                        i = m;
                    }
                    else {
                        if(c==0)
                            d.pollFirst();
                        else
                            d.pollLast();
                    }
                }
                else
                    c = c==0?1:0;
            }

            if(a==1)
                sb.append("error\n");
            else{
                sb.append("[");
                if(!d.isEmpty()){
                    if(c==0){
                        if(d.size()>1){
                            sb.append(d.pollFirst()+",");
                            while(d.size()>1)
                                sb.append(d.pollFirst()+",");
                        }
                        sb.append(d.pollFirst());
                    }
                    else{
                        if(d.size()>1){
                            sb.append(d.pollLast()+",");
                            while(d.size()>1)
                                sb.append(d.pollLast()+",");
                        }
                        sb.append(d.pollLast());
                    }
                }
                sb.append("]\n");
            }
        }
        System.out.print(sb);
    }

}