import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long i = 0, n = Integer.parseInt(br.readLine());
        if(n==1)
            System.out.println(1);
        else{
            long m = 1;
            for(int j = 0; j<30; j++){
                m*=2;
                if(m==n)
                    i = 1;
            }
            System.out.println(i);
        }
    }

}