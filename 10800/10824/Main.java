import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] a = new long[4];
        for(int i = 0; i<4; i++)
            a[i] = sc.nextInt();
        int i = 1;
        while(i < a[1])
            i*=10;
        int j = 1;
        while(j < a[3])
            j*=10;
        System.out.print(a[0]*i+a[1]+a[2]*j+a[3]);
    }

}