import java.util.Scanner;

public class wb6_5 {
    public static void main(String[] args) {

        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};

       int heighScore = 0;
       System.out.println("here are the scores: ");
       for (int i = 0; i < scores.length; i++) {
        System.out.print(scores[i] +" ");
        if (scores[i] > heighScore) {
        heighScore = scores[i];
       }

    }
     System.out.println("\n\nThe highest score is: " + heighScore + ". Give that man a cookie!");   
        
    }

    public static int randomNumber() {
        double randomDouble = Math.random() * 50000;
        int  randomInt = (int)randomDouble;
        return randomInt;
    }
}


/*
 Certainly! In the given code, the line "highScore = scores[i];" is responsible for updating the value of 
 the variable highScore. Let's break it down:

highScore is an integer variable that is initialized to 0 at the beginning of the code. 
It is used to keep track of the highest score found in the scores array.

Within the for loop, the code iterates through each element of the scores array. For each element, 
it checks if the current score (scores[i]) is greater than the current value of highScore.

If scores[i] is indeed greater than highScore, it means a new highest score has been found.
 So, the line highScore = scores[i]; updates the value of highScore to the new highest score (scores[i]).

By the end of the loop, the variable highScore will hold the maximum value found in the scores array, 
which represents the highest score overall.

Finally, 
the code prints out the highest score using System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");.

In summary, the line highScore = scores[i]; is used to update the value of
highScore whenever a new highest score is encountered while iterating through the scores array.
 */