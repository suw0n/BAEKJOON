import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n, re;
        while(true){
            n = Integer.parseInt(br.readLine());
            re = n;
            if(n==0)
                break;
            while(re > 9){
                re = 0;
                while(n != 0){
                    re += n%10;
                    n/=10;
                }
                n = re;
            }
            System.out.println(re);
        }
    }

}
