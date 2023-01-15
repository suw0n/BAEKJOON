import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine()), k = 0;
        while(n-->0){
            String[] s = br.readLine().split(" ");
            int m = Integer.parseInt(s[1]);
            if(map.containsKey(s[0]))
                map.replace(s[0], map.get(s[0])+m);
            else
                map.put(s[0], m);
        }
        for (Map.Entry<String, Integer> en : map.entrySet())
            k = en.getValue()==5?1:k;
        System.out.print(k==0?"NO":"YES");
    }

}