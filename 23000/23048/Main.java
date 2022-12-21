import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), k = 1;
        int[] re = new int[n+1];
        for(int i = 1; i<=n; i++)
            re[i] = 1;
        boolean[] arr = new boolean[n+1];
        arr[1] = true;
        for(int i = 2; i*i<=n; i++)
            for(int j = 2; i*j<=n; j++)
                arr[i*j] = true;
        for(int i = 1; i<=n; i++){
            if(!arr[i]){
                k++;
                for(int l = 1; i*l<=n; l++)
                    re[i*l] = k;
            }
        }
        System.out.println(k);
        for(int i = 1; i<=n; i++)
            System.out.print(re[i] + " ");
    }

}