import java.io.*;

public class Main {

    static String f(String s){
        int i = 0, j = s.length()-1;
        while(i<j)
            if(s.charAt(i++)!=s.charAt(j--))
                return "No";
        return "Yes";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while(t-->0)
            System.out.println(f(br.readLine().toLowerCase()));
    }

}