import java.util.Scanner;
import java.util.Random;
public class Numberguessing{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
Random r=new Random();
int secretNumber=r.nextInt(100)+1;
System.out.println("Welcome to number guessing game");
System.out.println("think a number between 1 and 100.");
int attempts=0;
boolean isCorrect=false;
while(!isCorrect){
System.out.println("take a guess: ");
int guess=in.nextInt();
attempts++;
if(guess==secretNumber){
isCorrect=true;
System.out.println("Congratulations!you guessed correct number" +attempts+ "attempts.");
}
else if(guess<secretNumber){
System.out.println("Too low!Try again.");
}
else{
System.out.println("Too high!Try again.");
}
}
in.close();
System.out.println("Thanks for playing the number guessing game.");
}
}