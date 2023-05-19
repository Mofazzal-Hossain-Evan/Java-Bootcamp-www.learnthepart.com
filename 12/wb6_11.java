public class wb6_11 {
    public static void main(String[] args) {

        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celsiusTofahrenheit(celsius);

        printTemperatures(celsius, "celsius");
        printTemperatures(fahrenheit, "Fahrenheit");


        
    }

    public static double[] celsiusTofahrenheit(double[] celsius) {
        double[] fahrenheit = new double[celsius.length];
        for (int i = 0; i < celsius.length; i++) {
            fahrenheit[i] = (celsius[i]/5 * 9)+32;
        }

        return fahrenheit;
        
    }

    public static void printTemperatures(double[] temp, String type) {
        System.out.print(type +": ");
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]+" ");
        }
        System.out.print("\n");
    }
}
