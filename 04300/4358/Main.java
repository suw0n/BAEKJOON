import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = 0;
        String s;
        Map<String, Double> map = new HashMap<>();
        while((s = br.readLine()) != null && ++n>0) {
            if(map.containsKey(s))
                map.replace(s, map.get(s)+1);
            else
                map.put(s, 1.0);
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for(int i = 0; i<list.size(); i++) {
            String k = list.get(i);
            sb.append(k + " " + String.format("%.4f", map.get(k)/n*100) + "\n");
        }
        System.out.print(sb);
    }

}