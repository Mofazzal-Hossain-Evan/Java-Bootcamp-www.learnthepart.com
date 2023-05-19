import java.util.Scanner;



public class wb5_3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("tell the number: ");
        int number = scan.nextInt();
        
        System.out.println("Great! here is the all numbers");
        
        
        for(int i = 0; i <= number; i++){
            System.out.println(i+"");
        }
        
        scan.close();
    

    }


}
