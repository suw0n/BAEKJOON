import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long re = 0;
        for(int i = 1; i<n; i++)
            re += (long)n*i+i;
        System.out.println(re);
    }
}