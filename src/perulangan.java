import java.util.Scanner;

public class perulangan {

    public static void main(String[] args) {

       for (int i =0; i < 10; i++) {
           System.out.println(i);
       }
        Scanner in = new Scanner(System.in);

       int i = 1;
       while (i <= 5) {
           System.out.print(i+" ");
           int input = in.nextInt();
           if (input%2==0){
               i++;
           }
       }

        // DO WHILE
       int i = 8;
       do {
           System.out.println("Dimulai");
           i++;
       } while (i<10);


        // CONTINUE & BREAK
        for (int i = 1; i <= 5; i++) {
            if (i%2==1) {
                System.out.println("angka ke-"+i+" telah diskip");
                continue;
            }

            System.out.print(i+" ");
        }

        // 1 2

    }

}
