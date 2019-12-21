package basic;
// https://www.geeksforgeeks.org/generating-random-numbers-in-java/
// https://www.geeksforgeeks.org/java-math-random-method-examples/
// https://www.geeksforgeeks.org/random-setseed-method-in-java-with-examples/

// use these links to learn more about random numbers
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
//import java.util.Timer;


// hint
// use Math library for now

public class RandomNumbers {
  public static void testProblem() {
    //System.out.println("Do you believe in me?");
  }
  public static void print(String text){
    System.out.println(text);
  }
  public static void pausemenu(){
    Scanner input = new Scanner(System.in);
    print("Press any key to continue");
    String a = input.nextLine();
  }
  public static void Prob1(){
    Scanner input = new Scanner(System.in);
    print("A number will now be generated");
    double RandGen = Math.random();
    print("You got "+RandGen+"!");
    print("\n");
    pausemenu();
    }

    public static void Prob2(){
      int min = 1;
      int max = 3;
      int range = (max - min) + 1;
        print("A number will now be generated");
      for(int i=0;i<=10;i++){
        int RandGen = (int)(Math.random()*range) + min;
        print("You got "+RandGen+"!");
        }
        print("\n");
        pausemenu();
      }
      public static void Prob3(){
        Scanner input = new Scanner(System.in);
        int min = 1;
        int max = 2;
        int range = (max - min) + 1;
        print("Greetings! \nWelcome to your Mental Health Assistant {MHA} \nWhat is your name?");
        String name = input.nextLine();
        int RandGen = (int)(Math.random()*range) + min;
        if (RandGen==1) {
          print(name + ", I believe in you!\nkeep it up!");
          }
        if (RandGen==2) {
          print("You suck, "+name );
          }
        print("\n");
        pausemenu();
        }

        public static void Prob4(){
        Scanner input = new Scanner(System.in);
        print("Greetings! \nWelcome to rock, paper, scissors                                                                  (and gun) \nWhat would you like to use?");
        print("Press 1 for rock\nPress 2 for paper\nPress 3 for scissors");
        int type = input.nextInt();  

        if (type==1) {
          print("You have chosen [Rock]");
          }
        
        if (type==2) {
          print("You have chosen [Paper]");
          }
        if (type==3) {
          print("You have chosen [Scissor]");
          }
        if (type==4) {
          print("You have chosen [Gun]");
          }
        print("\n");
        pausemenu();
        }
        
        public static void Prob5(){
        
          Scanner input = new Scanner(System.in);
          Random Rand = new Random();
          int seed = 69;
          print("Greetings! \nWelcome to the seed value test");
          pausemenu();
          Rand.setSeed(seed);
           print("A number will now be generated");
          for(int i=0;i<=10;i++){ 
            int randgen = Rand.nextInt(3);
          print("You got "+randgen+"!");
          }
         print("\n");
         pausemenu();
       }

          
        
  public static void main(String[] args) throws Exception {
    //testProblem();

    // 1. Generate a random number and print to screen.
      int x = 0;
    while (x==0){
      Scanner input = new Scanner(System.in);
    System.out.println("Please choose a problem");
    print("Press 1 for generating a random number\nPress 2 for generating a random number between 1 and 3\nPress 3 for the Mental Health Assistant\nPress 4 for a broken rock paper scissors\nPress 5 for a seed value test");
    Double aaa = input.nextDouble();
    print("\n");
    //System.out.println("You have choosen problem "+aaa+"\n");
    if(aaa == 1){
      Prob1();
    }
    if(aaa == 2){
      Prob2();
    }
    if(aaa == 3){
      Prob3();
    }
    if(aaa == 4){
      Prob4();
    }
    if(aaa == 5){
      Prob5();
    }
    if(aaa >=6){
      print("That is not a problem\n");
    }
    }
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
