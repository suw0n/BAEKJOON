import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<String, String> map = new HashMap<>();
        int[] nm = new int[2];
        for(int i = 0; i<2; i++)
            nm[i] = Integer.parseInt(st.nextToken());
        for(int i = 0; i<nm[0]; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            map.put(st2.nextToken(), st2.nextToken());
        }
        for(int i = 0; i<nm[1]; i++)
            sb.append(map.get(br.readLine())).append("\n");
        System.out.print(sb);
    }

}