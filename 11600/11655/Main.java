import java.util.Arrays;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int n = s.length();
        String[] arr = new String[n];
        for(int i = 0; i<n; i++)
            arr[i] = s.substring(i, n);
        Arrays.sort(arr);
        for(int i = 0; i<n; i++)
            System.out.println(arr[i]);
    }

}