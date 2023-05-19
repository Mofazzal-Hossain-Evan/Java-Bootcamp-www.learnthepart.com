public class ReturnValue_2 {
    public static void main(String[] args) { 
        double area1 = calculateArea(2.3, 3.6);
        printArea(2.3, 2.3, area1);

        String EnglishExplenation = explainArea("English");
        System.out.println(EnglishExplenation);
               
            
         }
     
     public static double calculateArea(double length, double width) {

        if (length < 0 || width < 0) {
            System.out.println("Invalid Dimension");
            System.exit(0);
            
        }
     
         double area = length * width;
         
        return area;
          
     }    

    public static String explainArea(String language) {

        switch (language) {
            case "English": return "Area equals length * width";
            case "Spanish": return "área es igual a largo * ancho";
            case "French":  return "La surface est égale à la longueur * la largeur";
            default: return "Language not available";
                
                
        }
    }

    public static void printArea(double length,double width, double area) {
        System.out.println("A rectangle "+ length+" and width of "+width+" and the area is"+area);
        
    }
}

