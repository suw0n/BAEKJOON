import java.util.StringTokenizer;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = 0, n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        while(m-->0){
            int k = Integer.parseInt(br.readLine());
            int[] arr = new int[k];
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int i = 0; i<k; i++)
                arr[i] = Integer.parseInt(st2.nextToken());
            for(int i = 1; i<k; i++) {
                if(arr[i-1]<arr[i]){
                    a = 1;
                    i = k;
                    m = 0;
                }
            }
        }
        System.out.print(a==1?"No":"Yes");
    }

}