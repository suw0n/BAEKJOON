import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0, mn = 0, n = Integer.parseInt(br.readLine());
        Map<String, Integer> m = new HashMap<>();
        while(n-->0){
            String s = br.readLine();
            if(m.containsKey(s))
                m.replace(s, m.get(s)+1);
            else
                m.put(s, 1);
        }
        List<String> key = new ArrayList<>(m.keySet());
        for(int i = key.size()-1; i>=0; i--){
            int l = m.get(key.get(i));
            if(max<l){
                max = l;
                mn = i;
            }
            else if(max==l){
                String a = key.get(mn);
                String b = key.get(i);
                mn = a.compareTo(b)<0?mn:i;
            }
        }
        System.out.print(key.get(mn));
    }

}