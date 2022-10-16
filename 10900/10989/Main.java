import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] a = new int[10010];
        int i = 0, n = Integer.parseInt(br.readLine());
        while(i++<n)
            a[Integer.parseInt(br.readLine())]++;
        i = 0;
        while(i++<10001)
            for(int j = 0; j<a[i]; j++)
                bw.write(i+"\n");
        bw.flush();
        bw.close();
    }

}