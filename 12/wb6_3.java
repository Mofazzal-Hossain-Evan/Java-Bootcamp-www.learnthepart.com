public class wb6_3{
    public static void main(String[] args) {
        String[] store = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};

        System.out.println("Do you sell coffee?\n");
        for (int i = 0; i < store.length; i++) {
            if (store[i].equals("coffee")) {
                System.out.println("\nWe have that in aisle: " + i);
                break;
            }
        }
    }
    
}
