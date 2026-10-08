import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();

        String[][] arena = new String[n+5][n+5];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (x == i && y == j) arena[i][j] = "X";
                else arena[i][j] = ".";
            }
        }

        //BEFORE MENGAMUK
        System.out.println("BEFORE");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(arena[i][j]);
            }
            System.out.println();
        }

        //AFTER MENGAMUK

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++){
                if (x == i || y == j) arena[i][j] = "X";
            }
        }

        System.out.println("AFTER");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(arena[i][j]);
            }
            System.out.println();
        }

    }

}
