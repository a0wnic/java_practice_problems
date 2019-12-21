package rock_paper_scissors;
import java.util.Random;
import java.util.Scanner;
public class RockyV1 {

    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        print("Greetings! \nWelcome to rock, paper, scissors                                                                                                      (and gun) \nWhat would you like to use?");
        print("Press 1 for rock\nPress 2 for paper\nPress 3 for scissors\nPress 0 to exit");
            int x = 0;
            while (x <= 1) {
                
            int type = input.nextInt();  
            int enem = rand.nextInt(3)+1;
            if (type == 0){
                break;
            }
            printtype(type);
            enemprinttype(enem);
            calculate(type, enem);
               
            }
        }


public static void print(String text){
    System.out.println(text);  
}
public static void printtype(int type){
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
      //print("\n"); 
}
public static void enemprinttype(int type){
    if (type==1) {
        print("The opponent have chosen [Rock]");
        
        }
      if (type==2) {
        print("The opponent chosen [Paper]");
        
        }
      if (type==3) {
        print("The opponent chosen [Scissor]");
       
        }
      //print("\n"); 
}
public static void calculate(int type, int enem){
    if (type==enem) {
        print("You have both tied");
        
        }
      if ((type==1 && enem == 3)||(type == 2 && enem == 1)||(type == 3 && enem == 2)) {
        print("You won, congradulations!");
   
        }
      if ((type==3 && enem == 1)||(type == 1 && enem == 2)||(type == 2 && enem == 3)) {
        print("You lost, better luck next time!");
   
        }
      if (type==4) {
        print("You have killed your opponent.\nCongrats");
        }
      print("\n"); 
}
}
