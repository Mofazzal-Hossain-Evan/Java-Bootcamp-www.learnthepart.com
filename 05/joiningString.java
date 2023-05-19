public class joiningString {
    /* 
    public static void main(String[] args) {
    String sentence = "Number of passengers:";
    System.out.println(sentence);
    int passengers = 0;
    passengers += 9;
    System.out.println(passengers);
    passengers -= 4;
    System.out.println(passengers);
    System.out.println(sentence);
    }
    */

    public static void main(String[] args) {
        String sentence = "Number of passengers: ";
        //System.out.println(sentence);
        int passengers = 0;
        System.out.println(sentence + passengers);
        passengers += 9;
        System.out.println(sentence + passengers);
        passengers -= 4;
        System.out.println(sentence + passengers);
       
        }
}
