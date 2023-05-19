public class wb3_4 {
    public static void main(String[] args) {
        int temp = 25;  

        String forcast;
        if (temp <= -1 ) {
          forcast = "its frozen !";
        } else if( temp <= 10) {
           forcast = "The forecast is Chilly. Wear a coat!";
        } else {
            forcast = "It's warm. go outside!";
        }

        System.out.println(forcast);


    }
}
