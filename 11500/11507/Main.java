import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> card = new HashMap<>();
        Map<String, Integer> validate = new HashMap<>();
        String s = br.readLine(), s2, s3;
        int n = s.length();
        for(int i = 0; i<n-2; i+=3) {
            s2 = s.substring(i, i+3);
            s3 = s2.substring(0, 1);
            card.put(s3, card.getOrDefault(s3, 0)+1);
            if(validate.containsKey(s2)) {
                System.out.print("GRESKA");
                return ;
            } else {
                validate.put(s2, 1);
            }
        }
        System.out.print((13-card.getOrDefault("P", 0)) + " " + (13-card.getOrDefault("K", 0)) + " " + (13-card.getOrDefault("H", 0)) + " " + (13-card.getOrDefault("T", 0)));
    }

}