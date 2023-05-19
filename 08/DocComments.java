public class DocComments {
    public static void main(String[] args) {
   
    }

    public static void greet() {
        System.out.println("hi");
    }

    /**
     * 
     * @param name(double)
     * @param Age(double)
     */
    public static void printText(String name, String Age) {
        System.out.println("Hi, I'm "+ name +" and I'm"+ Age +" years old");
       
        
    }
    
    /**
     * Function name: calculateArea
     * 
     * @param length (double)
     * @param width  (double)
     * @return       (double)
     */
    public static double calculateArea(double length, double width) {
        double area = length*width;
        return area;
    }
}
