import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();
        while(n-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String k = st.nextToken(), v = st.nextToken();
            if(map.containsKey(k))
                map.replace(k, v);
            else
                map.put(k, v);
        }
        List<String> l = new ArrayList<>(map.keySet());
        Collections.sort(l);
        for(int i = l.size()-1; i>=0; i--){
            String s = l.get(i);
            if("enter".equals(map.get(s)))
                System.out.println(s);
        }
    }

}