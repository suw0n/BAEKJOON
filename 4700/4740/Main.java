import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringBuilder sb = new StringBuilder(br.readLine());
            if("***".equals(sb.toString()))
                break;
            System.out.println(sb.reverse());
        }
    }

}