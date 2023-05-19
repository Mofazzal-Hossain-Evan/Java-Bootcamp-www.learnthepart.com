import java.util.Scanner;



public class RockPaperScissar {
    public static  void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock paper Scissors.");
        System.out.println("When I say 'shoot', chose: rock, paper or scissors.");
        System.out.println("are you ready? Write 'yes' if you are.");

        String ready =scan.nextLine();

        if(ready.equals("yes")) {
            System.out.println("\ngreat!");
            System.out.println("rock -- paper -- scissors, shoot!");
            String yourChoice = scan.nextLine();  
            String computerChoice = computerChoice();   

            String result = result(yourChoice, computerChoice);
            printResul(yourChoice, computerChoice, result);
                       
        } else {
            System.out.println("Darn, some other time....!");
        }
        scan.close();
    }
    
    public static String computerChoice() {

        double randomNumber = Math.random() * 3; //range 0-2.99
        int integer = (int)randomNumber;

        switch (integer) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
        
            default: return "";
            
        }       
    }

    public static String result(String yourChoice, String computerChoice) {

        String result = "";

        if(yourChoice.equals("rock") && computerChoice.equals("scissors")) {
            result ="you win";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("rock")) {
            result = "you loss";
        } else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
            result = "you win";
        } else if (yourChoice.equals("paper") && computerChoice.equals("scissors")) {
            result = "you loss";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            result = "you win";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("rock")) {
            result = "you loss";
        } else if(yourChoice.equals(computerChoice)) {
            result = "its a tie!";
        } else {
            System.out.println("INVALID CHOICE");
            System.exit(0);
        }

        return result;
        
    }
    
    public static void printResul(String yourChoice, String computerChoice, String result ) {
        
        System.out.println("\nYour choice:\t"+ yourChoice);
        System.out.println("The computer choce:\t"+computerChoice);
        System.out.println(result);
        
    }
}
