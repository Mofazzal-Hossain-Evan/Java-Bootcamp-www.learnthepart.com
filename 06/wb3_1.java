import java.util.Scanner;

public class wb3_1 {

    public static void main(String[] args) {

        double price = 32.5;
        double change = 66.43;

        // Scanner scan = new Scanner(System.in);
        System.out.println("Hi java, do I have enough to buy chips?");
        System.out.println("Java "+(change > price )+"\n");

        // String chips = scan.nextLine();
        // System.out.println();
         
        int capacity = 12;
        int people = 76;
        System.out.println("Me: Hi Java, can the elevator hold everyone?");
        System.out.println("Java: " + (capacity >= people) + "\n");

        String request = "PS5";
        String purchase = "Toy car";
        System.out.println("Me: Hi Java, will my friend be happy?");
        System.out.println("Java: " + (request.equals(purchase)) + "\n");

        int space = 9;
        int guests = 8;
        System.out.println("Me: Hi Java, can everyone attend my dinner party?");
        System.out.println("Java: " + (space >= guests) + "\n");
        
        int yourVotes = 25;
        int competitorVotes = 50;
        System.out.println("Me: Hi Java, will I win the election?");
        System.out.println("Java: " + (yourVotes > competitorVotes) + "\n");

    }
}