import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int sum=arr[0];
        int best=0;
        for (int i = 1; i<n;i++) {
            if (arr[i]>arr[i-1]){
                sum+=arr[i];
            } else {
                best = Math.max(best,sum);
                sum=arr[i];
            }
        }

        System.out.println(best);

    }

}
