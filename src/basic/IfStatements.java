package basic;
import java.util.Scanner;

public class IfStatements {
  
  public static void Prob1(){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number to check if it's greater than 2");
    Double a = input.nextDouble();
    if (a>2){
      System.out.println("Your number is greater than 2");
    }
    if (a==2){
      System.out.println("Your number is pretty nice");
    }
    if(a < 2){
      System.out.println("Your number sucks, 2 is better");
    }
      
      //Double b = input.nextDouble();
      //System.out.println("Addition was "+ (a+b) +"\nMultiplication was "+ (a*b) +"\nSubtraction was "+ (a-b) +"\nDivision was "+ (a/b) +"\nThe remainder was "+ (a%b) );
      System.out.println("\n");
  
      return;
      
  }
  public static void Prob2(){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number to check if it's even or odd");
    int a = input.nextInt();
    int even = a%2;
    if (even == 1){
      System.out.println("Your number is odd");
    }
    if(even == 0){
      System.out.println("Your number is even");
    }
      
      //Double b = input.nextDouble();
      //System.out.println("Addition was "+ (a+b) +"\nMultiplication was "+ (a*b) +"\nSubtraction was "+ (a-b) +"\nDivision was "+ (a/b) +"\nThe remainder was "+ (a%b) );
      System.out.println("\n");
    
      return;
      
  }
  
  public static void Prob3(){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number to check if they are equal");
    int a = input.nextInt();
    System.out.println("Please enter another number");
    int b = input.nextInt();
    if (a == b){
      System.out.println("Your numbers are equal");
    }
    if(a != b){
      System.out.println("Your numbers are not equal");
    }
      
      //Double b = input.nextDouble();
      //System.out.println("Addition was "+ (a+b) +"\nMultiplication was "+ (a*b) +"\nSubtraction was "+ (a-b) +"\nDivision was "+ (a/b) +"\nThe remainder was "+ (a%b) );
      System.out.println("\n");
      
      return;
      
  }
  
  
  public static void main(String[] args) throws Exception {
    // 1. Get number as input, print whether the number is greater than 2
    /*
    Test Input:
      2
    Expected Output:
      false
    */
    int x = 0;
    while (x==0){
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
    }
      
    // 2. Get number as input, print whether the number is even
    /*
    Test Inputs:
      2
      3
    Expected Outputs:
      true
      false
    */

    // 3. Get 2 numbers as input, print whether the 2 numbers are equal to eachother
    /*
    Test Inputs:
      2
      3
      ...
      4
      4
    Expected Outputs:
      false
      ...
      true
    */
  }
}