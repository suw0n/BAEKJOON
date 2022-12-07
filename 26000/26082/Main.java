import java.util.StringTokenizer;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];
        for(int i = 0; i<3; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        System.out.print(arr[1]/arr[0]*3*arr[2]);
    }

}