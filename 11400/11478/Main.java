import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<String> set = new HashSet<>();
        String s = br.readLine();
        int n = s.length();
        for(int i = 0; i<n; i++) {
            for(int j = i+1; j<=n; j++) {
                set.add(s.substring(i, j));
            }
        }
        System.out.print(set.size());
    }

}