public class wb3_2 {
    public static void main(String[] args) {
        
        double wallet = 100;

        System.out.println("Hi, How much money do you have? \n");
        System.out.println("I have "+ wallet+" dollar");

        double airplane = 60;
        System.out.println("Can we buy the airplane? \n");
        System.out.println("Let me check! \n");

        if(wallet > airplane) {
            System.out.println("let's buy!");
            
        } else {
            System.out.println("next time we will buy the airplane!");
        }

        System.out.println("How much money we have now?");
        System.out.println("let me check! \n"+"We have "+(wallet - airplane));
         
    double Wallet = wallet - airplane;
        double bird = 90;
        System.out.println("Can we buy this bird?\n"+"let me check\n");

        if (Wallet > bird) {
            System.out.println("we can buy bird!\n");
            
        } else {
            System.out.println("sorry!\n");
        }

    }
}
