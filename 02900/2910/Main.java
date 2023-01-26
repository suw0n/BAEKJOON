import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        HashMap<String, Integer> map = new LinkedHashMap<>();
        int[] nc = new int[2];
        for(int i = 0; i<2; i++)
            nc[i] = Integer.parseInt(st.nextToken());
        for(int i = 0; i<nc[0]; i++) {
            String s = st2.nextToken();
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        List<String> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> Integer.compare(map.get(o2), map.get(o1)));
        for(String s : list)
            for(int j = map.get(s); j>0; j--)
                System.out.print(s + " ");
    }

}