public class wb6_13 {
    public static void main(String[] args) {
        
        double[][] prices = {
            {12.99, 8.99, 9.99, 10.49, 11.99},
            {0.99, 1.99, 2.49, 1.49, 2.99},
            {8.99, 7.99, 9.49, 9.99, 10.99}
        };

        for (int i = 0; i <prices.length; i++) {
            switch (i) {
                case 0: System.out.println("Baking: "); break;
                case 1: System.out.println("Beverage: "); break;
                case 2: System.out.println("Cereals: "); break;

            }
            
        for (int j = 0; j < prices[i].length; j++) {
            System.out.println(prices[i][j]+" ");
        }
        System.out.println("\n");
        }
    }
}
