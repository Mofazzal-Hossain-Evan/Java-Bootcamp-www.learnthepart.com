package carProject;
public class Main {
    
    public static void main(String[] args) {

        car nissan = new car("Nissan", 1000, 2020, "Green");
        car dodge = new car("Dodge", 1234,1999,"Blue");
        car nissan2 = nissan;

        
        System.out.println(nissan.parts);
        nissan.drive();




        
    }
}
 