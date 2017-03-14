import java.io.Console;

public class Package {
  public static void main(String[] args){
    Console myConsole = System.console();
    System.out.println("How much does your package weigh?: ");
    Integer weight = Integer.parseInt(myConsole.readLine());
    System.out.println("How far are you sending your package?: ");
    Integer distance = Integer.parseInt(myConsole.readLine());
    String stringTotal = Integer.toString((weight/5) + (distance/20) * 3);
    System.out.println("Your total cost will be $" + stringTotal + ". Wow. That sucks.");
  }
}
