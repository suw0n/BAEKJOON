import java.util.StringTokenizer;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int re = 0;
        int[] arr = new int[2];
        for(int i = 0; i<2; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        while(arr[0]>1&&arr[1]>0){
            arr[0]-=2;
            arr[1]--;
            re++;
        }
        System.out.print(re);
    }

}