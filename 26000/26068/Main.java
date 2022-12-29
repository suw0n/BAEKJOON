import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), m = 0;
        while(n-->0)
            m = Integer.parseInt(br.readLine().substring(2))<91?m+1:m;
        System.out.print(m);
    }

}