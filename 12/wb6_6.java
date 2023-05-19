public class wb6_6 {
    

    public static void main(String[] args) {
        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),
            randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};

            System.out.println("Here are the scores: ");
            for (int i = 0 ; i < scores.length; i++) {
                System.out.print(scores + " ");
            }

            int highScore = 0;
            int seat = 0;
        
            for (int i = 0; i < scores.length; i++) {
                if (scores[i] > highScore) {
                    highScore = scores[i];
                    seat = i;
                }
            }

            System.out.println("\n\nThe highest score is: " + highScore + ". Impressive!");
            System.out.println("It's the gentleman in seat: " + seat + ". Give that man a cookie!");
    }


    public static int randomNumber() {

        double randomDouble = Math.random() * 5000;
        int randomInt = (int)randomDouble;
        return randomInt;
    }


}

    /* Certainly! In the given code, the line "seat = i;" is inside a for loop that iterates over the array of scores. Let's break it down:

    1. The variable "seat" is initialized to 0 before the loop begins. It represents the seat number associated with the highest score.

    2. During each iteration of the loop, the code checks if the current score (scores[i]) is greater than the current highest score (highScore).

    3. If the condition is true, meaning the current score is higher than the previous highest score, the following actions occur:
    - The variable "highScore" is updated to hold the new highest score (scores[i]).
    - The variable "seat" is updated to hold the index of the current score (i).

    By assigning "seat = i;", the code keeps track of the index (seat number) where the highest score was found. 
    The variable "seat" will hold the seat number of the person who achieved the highest score. */