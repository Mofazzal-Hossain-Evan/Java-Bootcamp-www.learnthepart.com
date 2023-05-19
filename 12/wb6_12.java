import java.util.Arrays;

public class wb6_12 {
    public static void main(String[] args) {
        int[] ticket = {34, 43, 45, 65, 21, 54};
        int[] ticket2 = Arrays.copyOf(ticket, ticket.length);
        ticket[2] = 56;

        System.out.print("Ticket 1 numbers:  ");
        printTicketNumbers(ticket);

        System.out.print("Ticket 2 numbers:  ");
        printTicketNumbers(ticket2);

    }
public static void printTicketNumbers(int[] ticket) {

    for (int i = 0; i < ticket.length; i++) {
        System.out.print(ticket[i]+ " ");
    }
    System.out.print("\n\n");
    
}
}
