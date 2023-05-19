public class returnValues {
    public static void main(String[] args) { 
        double area1 = calculateArea(2.3, 3.6);
        double area2 = calculateArea(1.6, 2.4);
        double area3 = calculateArea(2.6, 4.2);
        double area4 = calculateArea(-1.2, -3.1);

        String EnglishExplenation = explainArea("English");
        String SpanishExplenation = explainArea("Spanish");
        String FrenchExplenation = explainArea("French");
        String ItalianExplenation = explainArea("Ialian");

               
            
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
    
}

// English "Area equals length * width";
// Spanish área es igual a largo * ancho;
// French La surface est égale à la longueur * la largeur;