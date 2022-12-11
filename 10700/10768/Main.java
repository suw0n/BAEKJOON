import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        System.out.print(m==2&&d==18?"Special":m>2||(m==2&&d>18)?"After":"Before");
    }

}