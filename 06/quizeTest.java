public class quizeTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        
        String Olympics = scan.nextLine();
        
        switch (Olympics) {
            
            case "TestCase1": 
            
            if (Olympics.equals("a")) { 
                System.out.println(" not correct");
            } else if (Olympics.equals("b")) {
                System.out.println(" not correct");
            } else if (Olympics.equals("c")) { 
                System.out.println(" correct! its Brazil");
            } else if (Olympics.equals("d")) { 
                System.out.println(" not correct");
            } else {
                System.out.println("sorry you did not type correctly");
            } 
            break;
        
        }
        
        System.out.println("2. Which planet is the hottest?");
        System.out.println("\ta)Venus \n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        
        scan.nextLine();
        String hot_planet = scan.nextLine();
        
        switch (hot_planet) {
        
            case "TestCase2": 
            
            if (hot_planet.equals("a")) { 
                System.out.println(" correct! its Venus");
                String Venus =scan.nextLine();
            } else if (hot_planet.equals("b")) {
                System.out.println(" not correct");
            } else if (hot_planet.equals("c")) { 
                System.out.println(" not correct ");
            } else if (hot_planet.equals("d")) { 
                System.out.println(" not correct");
            } else {
                System.out.println("sorry you did not type correctly");
            } 
            
            break;
        
        }
            
        
        System.out.println("3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        
        String rarest_blood = scan.nextLine();
        
        switch (rarest_blood) {
        
            case "TestCase2": 
            
            if (rarest_blood.equals("a")) { 
                System.out.println(" correct! its Venus");
            } else if (rarest_blood.equals("b")) {
                System.out.println(" not correct");
            } else if (rarest_blood.equals("c")) { 
                System.out.println(" not correct ");
            } else if (rarest_blood.equals("d")) { 
                System.out.println(" not correct");
            } else {
                System.out.println("sorry you did not type correctly");
            } 
            
            break;
        
        }
        
        System.out.println("4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n\td) AB-Negative\n");
        
        String friends_with_Harry = scan.nextLine();
        
        switch (friends_with_Harry) {
        
            case "TestCase2": 
            
            if (friends_with_Harry.equals("a")) { 
                System.out.println(" correct! its Venus");
            } else if (friends_with_Harry.equals("b")) {
                System.out.println(" not correct");
            } else if (friends_with_Harry.equals("c")) { 
                System.out.println(" not correct ");
            } else if (friends_with_Harry.equals("d")) { 
                System.out.println(" not correct");
            } else {
                System.out.println("sorry you did not type correctly");
            } 
            
            break;
        
        }
        
        scan.close();
        
            }
}
