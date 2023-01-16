import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), m, min = 101;
        String[] arr= new String[n];
        for(int i = 0; i<n; i++)
            arr[i] = br.readLine();
        m = arr[0].length();
        for(int i = 0; i<m; i++){
            Set<String> set = new HashSet<>();
            for(int j = 0; j<n; j++)
                set.add(arr[j].substring(i));
            min = set.size()==n?m-i:min;
        }
        System.out.print(min);
    }

}