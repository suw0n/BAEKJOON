import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), m = 0;
        List<Integer> list = new ArrayList<>();
        boolean[] arr = new boolean[n+1];
        arr[0] = arr[1] = true;

        for(int i = 2; i*i<=n; i++)
            for(int j = 2; i*j<=n; j++)
                arr[i*j] = true;
        for(int i = 2; i<=n; i++)
            if(!arr[i])
                list.add(i);

        int a = list.size();
        for(int i = 0; i<a; i++){
            int sum = 0;
            for(int j = i; j<a; j++){
                sum+=list.get(j);
                if(sum > n)
                    break;
                else if(sum==n)
                    m++;
            }
        }
        System.out.print(m);
    }

}