import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n;
        while(true){
            n = Integer.parseInt(br.readLine());
            if(n==0)
                break;
            for(int i = 0; i<n; i++) {
                for (int j = 0; j<=i; j++)
                    System.out.print("*");
                System.out.println();
            }
        }
    }

}