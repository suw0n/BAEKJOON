import java.util.StringTokenizer;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int max = -2000000000;
        int[] nk = new int[2];
        for(int i = 0; i<2; i++)
            nk[i] = Integer.parseInt(st.nextToken());
        int[] arr = new int[nk[0]+1];
        for(int i = 1; i<=nk[0]; i++)
            arr[i] = Integer.parseInt(st2.nextToken())+arr[i-1];
        for(int i = nk[1]; i<=nk[0]; i++){
            int sum = arr[i]-arr[i-nk[1]];
            max = max<sum?sum:max;
        }
        System.out.print(max);
    }

}