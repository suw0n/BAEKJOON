import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            TreeMap<Integer, Integer> map = new TreeMap<>();
            int n = Integer.parseInt(br.readLine());
            while(n-->0){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String s = st.nextToken();
                int a = Integer.parseInt(st.nextToken());
                if("I".equals(s))
                    map.put(a, map.getOrDefault(a, 0)+1);
                else if(!map.isEmpty()){
                    int key = a==-1?map.firstKey():map.lastKey();
                    int v = map.get(key);
                    if(v>1)
                        map.put(key, v-1);
                    else
                        map.remove(key);
                }
            }
            sb.append((map.isEmpty() ? "EMPTY" : (map.lastKey() + " " + map.firstKey())) + "\n");
        }
        System.out.print(sb);
    }

}