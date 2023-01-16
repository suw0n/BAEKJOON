import java.io.*;

public class Main {

    static int f(int a){
        int re = 1;
        while(a != 0){
            re*=a%10;
            a/=10;
        }
        return re;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n;
        while(true){
            n = Integer.parseInt(br.readLine());
            if(n==0)
                break;
            System.out.print(n + " ");
            while(n>9){
                n = f(n);
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

}