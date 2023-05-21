/**
 * wb6_14
 */
public class wb6_14 {

    public static void main(String[] args) {

        int[][] array = new int[2][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomNumber();
            }
        }
        print2DArray(array);
    }

    public static int randomNumber() {

        double randomNumber = Math.random()*5;
        return (int)randomNumber;
        
    }

    public static void print2DArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]+" ");
            }
            System.out.println("\n");
        }
        
    }
}