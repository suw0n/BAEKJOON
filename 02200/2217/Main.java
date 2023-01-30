import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine()), max = 0;
        for(int i = 0; i<n; i++)
            list.add(Integer.parseInt(br.readLine()));
        Collections.sort(list);
        for(int i = n-1; i>=0; i--)
            map.put(list.get(i), n-i);
        for(int i = 0; i<n; i++){
            int k = list.get(i)*map.get(list.get(i));
            max = max<k?k:max;
        }
        System.out.print(max);
    }

}