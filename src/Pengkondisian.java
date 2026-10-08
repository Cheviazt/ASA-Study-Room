import java.util.Scanner;

public class Pengkondisian {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        int a = in.nextInt();

//        if (a%2==0){
//            System.out.println("Genap ini");
//        } else {
//            System.out.println("Ganjil ini");
//        }


        // SWITCH

        String grade = in.next();
        switch (grade) {
            case "A":
                System.out.println("Rankmu A");
                break;
            case "B":
                System.out.println("Rankmu B");
                break;
            default:
                System.out.println("Kamu galolos");
        }

    }

}
