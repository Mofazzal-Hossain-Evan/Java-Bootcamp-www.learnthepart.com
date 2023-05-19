public class ifElse {
    public static void main(String[] args) {
        
        int grade = 90;

        if (grade >= 80) {
            System.out.println("passed!");
        } else if( grade >= 70){
             System.out.println("you got B");      
        } else if(grade >= 60){
            System.out.println("you got C");
        } else {
            System.out.println("sorry");
        }
    }
}
