public class whileloop {
    public static void main(String[] args) {
       
        double choice = 0.01;
        double guess = 0.09;

        while (guess > choice) {
            
            guess = Math.random();
            System.out.println(guess);
         
        }
    }

}
