package carProject;

import java.util.Arrays;

public class Car {
   private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;
    

    public Car(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
        //this.parts = parts; 
    }
    
    public Car(Car source) {
        
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String[] getParts() {
        return this.parts;
    } 

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts,parts.length);
    }



    public void drive() {
        System.out.println("you bought the beautiful car "+this.year+" "+this.color);
        System.out.println("pleas drive your car to nearest exit.\n");
    }


    public String toString() {
    return "make: " + this.make + " .\n"
         + "price: " + this.price + " .\n"
         + "Year: " + this.year + " .\n"
         + "Color: " + this.color + " .\n"
         + "Parts: " + Arrays.toString (this.parts) + " .\n";
    }


}
