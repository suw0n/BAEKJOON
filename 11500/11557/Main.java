import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            List<String> s = new ArrayList<>();
            List<Integer> i = new ArrayList<>();
            while(n-->0){
                StringTokenizer st = new StringTokenizer(br.readLine());
                s.add(st.nextToken());
                i.add(Integer.parseInt(st.nextToken()));
            }
            int max = i.get(0), mn = 0;
            for(int j = i.size()-1; j>0; j--){
                if(max<i.get(j)){
                    max = i.get(j);
                    mn = j;
                }
            }
            System.out.println(s.get(mn));
        }
    }

}