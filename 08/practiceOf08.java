public class practiceOf08 {

    /**
     * 
     * @param args
    
     */
    public static void main(String[] args) {
        String input = "Hello, World!";
        String processed1 = processInput(input);
        printOutput(processed1);
    }

    public static String processInput(String input) {
        String processed = input.toLowerCase();
        return processed;
    }

    public static void printOutput(String outputt) {
        System.out.println(outputt);
    }

    
}

