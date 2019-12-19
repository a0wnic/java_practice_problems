package basic;
// https://www.geeksforgeeks.org/generating-random-numbers-in-java/
// https://www.geeksforgeeks.org/java-math-random-method-examples/
// https://www.geeksforgeeks.org/random-setseed-method-in-java-with-examples/

// use these links to learn more about random numbers
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;


// hint
// use Math library for now

public class RandomNumbers {
  public static void testProblem() {
    //System.out.println("Do you believe in me?");
  }
  
  public static void Prob1(){
    Scanner input = new Scanner(System.in);
    System.out.println("A number will now be generated");
    double RandGen = Math.random();
    System.out.println("You got "+RandGen+"!");
    }

    public static void Prob2(){
      Scanner input = new Scanner(System.in);
      System.out.println("A number will now be generated");
      int RandGen = Math.random();
      System.out.println("You got "+RandGen+"!");
      }
      
  public static void main(String[] args) throws Exception {
    //testProblem();

    // 1. Generate a random number and print to screen.
      Prob1();
    // 2. Generate a random number between 1 and 3. print that number.

    // 3. Mental Health Therapist program:
    // Ask usere for their name?
    // random print "I believe in you!" or "You suck!"

    // 4. Get user input, print matching string to number
    // 1 -> "rock", 2 -> "paper", 3 -> "scissors"

    // 5. Set a seed "seed value".
    // Randomly generate a number.
    // Run program 4 times to ensure that it generates the same number each time.
  }
}
