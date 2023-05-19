public class workbook2_3 {
    public static void main(String[] args) {
        
       int numOfApple = 0;
       int numOfCustomers = 0;
       double profit = 0;

       System.out.println("You picked 500 apples from an apple orchard");
       numOfApple += 500;
       System.out.println("");


       System.out.println("Time for business! You're selling each apple for 40 cents");
       double price = 0.40;
       System.out.println("");

       System.out.println("One customer walked in. He bought 4 apples!");
       numOfApple -= 4;
       numOfCustomers++;
       profit += 4*price;
       System.out.println("");

       System.out.println("Another customer walked in. He bought 20 apples!");
       numOfApple = 20;
       numOfCustomers++;
       profit += 20*price;
       System.out.println("");

       System.out.println("Another customer walked in. She bought 200 apples!");
       numOfApple = 200;
       numOfCustomers++;
       profit += 200*price;
       System.out.println("");

       System.out.println("Wow! So far, you made: $" + profit);
       System.out.println(numOfCustomers +" customers love your apples.");
       System.out.println("You have " + numOfApple+ " apples left. We'll sell more tomorrow!");
       System.out.println("");
       System.out.println("");

    }
}
