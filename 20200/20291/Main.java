import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            StringTokenizer st = new StringTokenizer(br.readLine(), ".");
            String[] s = new String[2];
            for(int i = 0; i<2; i++)
                s[i] = st.nextToken();
            if(map.containsKey(s[1]))
                map.replace(s[1], map.get(s[1])+1);
            else
                map.put(s[1], 1);
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for(int i = 0; i<list.size(); i++)
            System.out.println(list.get(i) + " " + map.get(list.get(i)));
    }

}