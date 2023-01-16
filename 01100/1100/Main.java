import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int re = 0;
        for(int z = 0; z<8; z++){
            String s = br.readLine();
            if(z%2==0)
                for(int i = 0; i<8; i+=2)
                    re = s.charAt(i)=='F'?re+1:re;
            else
                for(int i = 1; i<8; i+=2)
                    re = s.charAt(i)=='F'?re+1:re;
        }
        System.out.print(re);
    }

}