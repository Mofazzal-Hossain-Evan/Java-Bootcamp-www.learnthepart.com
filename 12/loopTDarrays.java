public class loopTDarrays {
    // public static void main(String[] args) {
    //     int[][] grades = {
    //      {23,34,34},
    //      {43,54,23,54},
    //      {45,44,23,75,545,5445}
    //     };

    //     for (int j = 0; j<grades[0].length; j++) {
    //         System.out.print(" "+grades[0][j]);
    //     }

    //     System.out.print("\n");

    //     for (int j = 0; j < grades[1].length; j++) {
    //         System.out.print(" "+grades[1][j]);
    //     }

    //     System.out.print("\n");

    //     for (int j = 0; j < grades[1].length; j++) {
    //         System.out.print(" "+grades[2][j]);
    //     }

    //     System.out.print("\n");

        
    // }

    public static void main(String[] args) {

        int[][] grades = {

         {23,34,34},
         {43,54,23,54},
         {45,44,23,75,545,5445}
        };
        
        for (int i =0; i < grades.length; i++) {

            switch(i) {
                case 0: System.out.println("\tHarry: "); break;
                case 1: System.out.println("\tHarry: "); break;
                case 2: System.out.println("\tbake: "); break;
            }
            for (int j = 0; j < grades.length; j++) {
                System.out.println(grades[i][j]+ " ");
            }
            System.out.print("\n");
        }
    }
}
