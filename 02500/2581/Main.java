import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] arr = new boolean[10010];
        arr[1] = true;
        for(int i = 2; i*i<=10000; i++)
            for(int j = 2; i*j<=10000; j++)
                arr[i*j] = true;
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = 0, sum = 0, min = 10000;
        for(int i = a; i<=b; i++){
            if(!arr[i]){
                c++;
                sum += i;
                min = min>i?i:min;
            }
        }
        if(c==0)
            System.out.print(-1);
        else
            System.out.print(sum + "\n" + min);
    }

}
