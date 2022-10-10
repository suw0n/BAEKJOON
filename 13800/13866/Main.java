import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[5];
        for(int i = 0; i<4; i++)
            arr[i] = sc.nextInt();
        arr[4] = arr[0]+arr[3]-arr[1]-arr[2];
        System.out.println(arr[4]<0?arr[4]*-1:arr[4]);
    }

}