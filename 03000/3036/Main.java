import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int gcd(int a, int b){
        return b==0?a:gcd(b, a%b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] s = br.readLine().split(" ");
        for(int i = 0; i<n; i++)
            arr[i] = Integer.parseInt(s[i]);
        for(int i = 1; i<n; i++){
            int m = gcd(arr[0], arr[i]);
            sb.append(arr[0]/m+"/"+arr[i]/m+"\n");
        }
        System.out.print(sb);
    }

}