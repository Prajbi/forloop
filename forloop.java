import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (num = 1; num <= n; num++)
        // for( int num = n; num >= 1; num--)
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
            System.out.println(arr[3]);
            arr[i] = arr[i] + 1;
            System.out.println(arr[2]);
            // arr[i] = arr[i] + 1;
        }
        System.out.println(arr[3]);

    }
}
