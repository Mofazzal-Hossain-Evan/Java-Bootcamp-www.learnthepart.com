import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

     int roll1 = rollDIce();
     int roll2 = rollDIce();
     int roll3 = rollDIce();
    
     System.out.println("Enter 3 numbers betwen 1-6");

     int num1 = scan.nextInt();
     int num2 = scan.nextInt();
     int num3 = scan.nextInt();

     if(num1 < 1 || num2 < 2 || num3 < 3) {
        System.out.println(" input 1-3");
        System.exit(0);
     }
    
     if(num1 > 6 || num2 > 6 || num3 > 6) {
        System.out.println("Number can not be higher then 6");
        System.exit(0);
     }

     int sumOfNumbers = num1 + num2 + num3;
     int sumOfDice = roll1 + roll2 + roll3;
     System.out.println("Dice sum = "+sumOfDice+" number sum = "+sumOfNumbers);

     if (checkWine(sumOfDice, sumOfNumbers)){
        System.out.println("you win!");
     } else {
        System.out.println("sorry you lost");
     }

     scan.close();;
        
    }

    public static int rollDIce() {
        double randomNumber =Math.random()*6;
        randomNumber += 1;
        return(int)randomNumber;
    }

    public static boolean checkWine(int sumOfDice, int sumOfNumbers) {
        return(sumOfNumbers > sumOfDice && sumOfNumbers - sumOfDice < 3);
        
    }
}
