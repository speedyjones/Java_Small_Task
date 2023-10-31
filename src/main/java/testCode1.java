import java.util.Arrays;
import java.util.Scanner;

public class testCode1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int n = 0; n < arr.length; n++) {
            arr[n] = sc.nextInt();
        }

        Arrays.sort(arr);
        int median = (size + 1) / 2;
        System.out.println(arr[median]);


    }
}