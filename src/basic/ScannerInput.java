package basic;
import java.util.Scanner;


//  
// use this link as a tutorial on how to use the Scanner class to get user input.

public class ScannerInput {
  public static void Prob1(){
    Scanner input = new Scanner(System.in);
    System.out.println("Please input two numbers");
    Double a = input.nextDouble();
    System.out.println("Input recieved\nPlease enter next number");
    Double b = input.nextDouble();
    System.out.println("Your answer was " + a*b);
    return;
  }
  public static void Prob2(){
    Scanner input = new Scanner(System.in);
    System.out.println("Please choose two nunmbers");
    Double a = input.nextDouble();
    System.out.println("Please pick another number");
    Double b = input.nextDouble();
    System.out.println("Addition was "+ (a+b) +"\nMultiplication was "+ (a*b) +"\nSubtraction was "+ (a-b) +"\nDivision was "+ (a/b) +"\nThe remainder was "+ (a%b) );
    return;
  }
  
  public static void Prob3(){
    Scanner input = new Scanner(System.in);
    Double a = input.nextDouble();
    for(int i=0; i <= 10; i++) {
      System.out.println(a + " x " + i +"=" +(a*i));
      }
      return;
    }
  
  public static void main(String[] args) throws Exception {
    // 1. Write a Java program that takes two numbers as input and display the product of two numbers.
    /*
    Test Data:
      Input first number: 25
      Input second number: 5
    Expected Output:
      25 x 5 = 125
    */
    
    

    //String userName = myObj.nextLine();  // Read user input
    //System.out.println("Username is: " + userName);  // Output user input


    // 2. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
    /*
    Test Data:
      Input first number: 125
      Input second number: 24
    Expected Output :
      125 + 24 = 149
      125 - 24 = 101
      125 x 24 = 3000
      125 / 24 = 5
      125 mod 24 = 5
    */

    // 3. Write a Java program that takes a number as input and prints its multiplication table upto 10.
    /*
    Test Data:
      Input a number: 8
    Expected Output:
      8 x 1 = 8
      8 x 2 = 16
      8 x 3 = 24
      ...
      8 x 10 = 80
    */
    Scanner input = new Scanner(System.in);
    System.out.println("Please choose a problem");
    Double aaa = input.nextDouble();
    System.out.println("You have choosen problem "+aaa);
    if(aaa == 1){
      Prob1();
    }
    if(aaa == 2){
      Prob2();
    }
    if(aaa == 3){
      Prob3();
    }
    // 4. Write a Java program to display the following pattern.
    /*
      Sample Pattern :

   J    a   v     v  a                                                  
   J   a a   v   v  a a                                                 
J  J  aaaaa   V V  aaaaa                                                
 JJ  a     a   V  a     a
    */


  }
}