public class Weather {
    public static void main(String[] args) {
        double noon = 77;
        double evening = 61;
        double midnight = 55;

        printTemperatures(noon);
        printTemperatures(evening);
        printTemperatures(midnight);
    }



    private static double fahrenheitToCelsius(double fahrenheit) {

        return(fahrenheit - 32) * 5 / 9;
        
    }

    public static void printTemperatures(double fahrenheit) {
        System.out.println("F: " + fahrenheit);
        System.out.println("C: " + fahrenheitToCelsius(fahrenheit) +"\n");
    }
}
