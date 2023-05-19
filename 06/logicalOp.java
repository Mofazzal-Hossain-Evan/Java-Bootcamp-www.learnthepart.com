public class logicalOp {
    public static void main(String[] args) {

        int chamGrade = 50;
        int engGrade = 50;
        String lang = "java";

        if (chamGrade > 70 || engGrade > 70 || lang.equals(lang)){
            System.out.println("passed");
        } else {
            System.out.println("sorry");
        }

        int credits = 55;
        double GPA = 2.70;

        if(credits >= 40 && GPA >= 2.00) {
            System.out.println("pssed");
        } else {
            System.out.println("not ok");
        }
        
    }
}
