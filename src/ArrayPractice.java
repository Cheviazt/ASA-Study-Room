public class ArrayPractice {

    public static void main(String[] args) {

        int[] arr = new int[10];

        System.out.println(arr[5]);

        arr[5] = 1;
        System.out.println(arr[9]);

        int[] arrayInt = new int[]{
                20,10,11,2
        };

        System.out.println(arrayInt[3]);

        String[] stringArr = new String[]{
                "Gaffa","Fadhlanul","Rozaq","Jelek"
        };

        System.out.println(stringArr[0]);
        System.out.println(stringArr.length);


        // ARRAY 2D

        String[][] name = new String[][]{
                {"Gaffa", "Fadhlanul", "Rozaq"},
                {"Jokowi", "Dodo"}
        };
        // Jokowi Fadhlanul Rozaq
        System.out.println(name[1][0]+ " "+name[0][1]+" "+name[0][2]);

        int[][] arrInt = new int[5][5];

//        arr[]
        System.out.println(arrInt[1][3]);

    }

}
