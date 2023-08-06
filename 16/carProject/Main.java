package carProject;
public class Main {
    
    public static void main(String[] args) {

        car nissan = new car("Nissan", 1000, 2020, "Green");


        car dodge = new car("Dodge", 1234,1999,"Blue");


        System.out.println("\n"+"This " + nissan.getmk() + " is worth $" + nissan.getprice() + 
        ". It was built in " + nissan.getyear() + ". It is " + nissan.getcolor() + ".\n");
        System.out.println("This " + dodge.getmk() + " is worth $" + dodge.getprice() + 
        ". It was built in " + dodge.getyear() + ". It is " + dodge.getcolor() + ".\n");

        
    }
}
