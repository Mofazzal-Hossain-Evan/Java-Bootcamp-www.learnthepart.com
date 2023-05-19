import java.util.Scanner;

public class Survey {
   

    public static void main(String[] args) {
       
       int counter = 1 ;
       Scanner scan = new Scanner(System.in);
       System.out.println("Welcome!");
       System.out.println("");

       
       System.out.println("What is your name?");
       String name  = scan.nextLine();
       counter++;
       System.out.println("hlw! "+name);
       System.out.println("");

       
       System.out.println("how much money do spend for coffe? ");
       double coffeePrice = scan.nextDouble();
       counter++;
       System.out.println("\n So, you are spending "+coffeePrice+" for your coffee! ");
       System.out.println("");

       
       System.out.println("how much money do spend for your fast food? ");
       double fastFood = scan.nextDouble();
       counter++;
       System.out.println(" you are spending "+fastFood +" for your fast food!");
       System.out.println("");

       
       System.out.println("how may times do you buy coffee?");
       int coffeCount = scan.nextInt();
       counter++;
       System.out.println("you buy coffee "+coffeCount +" times in a week? ");
       System.out.println("");

       System.out.println("\n Thank you "+ name +" for all your "+counter+" answers!");
       System.out.println("you are spending "+(coffeePrice*coffeCount)+" for a week\n");
       scan.close();
       System.out.println("");

    }
}
