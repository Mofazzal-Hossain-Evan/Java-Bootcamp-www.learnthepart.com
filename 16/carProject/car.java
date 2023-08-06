package carProject;
public class car {
   private String make;
    private double price;
    private int year;
    private String color;
    

    public car(String make, double price, int year, String color) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
    }

    public String getmk() {
        return make;
    } 

    public void setmake() {

    }

    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
        
    }

    public int getyear() {
        return year;
    }

        public void setyear(int year) {
        this.year = year;
        
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
    this.color = color;
        
    }




}
