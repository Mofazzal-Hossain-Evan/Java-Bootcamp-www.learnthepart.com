import java.util.Scanner;

public class wb5_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("I hear you like to count by three\n");
        System.out.println("Jimmy: It depends."+"\noh,ok....");

        System.out.print("1. Pick a number to count by: ");
        int countBy = scan.nextInt();
        System.out.print("2. Pick a number to start counting from: ");
        int countingFrom = scan.nextInt();
        System.out.print("3. Pick a number to count to: ");
        int numberToCount = scan.nextInt();

        for(int i = countingFrom;  i < numberToCount; i++){
            System.out.print(i+" ");
        }

    }
}
