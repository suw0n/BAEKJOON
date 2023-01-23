import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>(List.of(br.readLine().split(" ")));
        for(int i = 0; i<n; i++)
            map.put(list.get(i), 0);
        for(int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                String s = st.nextToken();
                map.put(s, map.get(s)+1);
            }
        }
        Collections.sort(list, (a, b)->{
            int x = map.get(a), y = map.get(b);
            return x<y?1:x==y?a.compareTo(b):-1;
        });
        for(int i = 0; i<n; i++)
            System.out.println(list.get(i) + " " + map.get(list.get(i)));
    }

}