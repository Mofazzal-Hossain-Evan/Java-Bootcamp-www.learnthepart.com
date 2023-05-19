
import java.util.Arrays;

public class updateArray {

    public static void main(String[] args) {
        String[] menu = {"Espresso", "Iced Coffe", "Macchiato"};
    //    String menuString = Arrays.toString(menu);
        menu[2] = "katte";
       System.out.println(Arrays.toString(menu));

       String[] newMenu = new String[5];

       for (int i = 0; i < menu.length; i++) {
        newMenu[i] = menu[i];
       }

       newMenu[3] = "House Blend";
       newMenu[4] = "Dark Rost";

       System.out.println(Arrays.toString(newMenu));
    }
}