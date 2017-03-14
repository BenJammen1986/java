import java.io.Console;

public class Hotel {
  public static void main(String[] args){
    Console myConsole = System.console();
    System.out.println("In what season are you booking your trip: summer or winter?");
    String season = myConsole.readLine();
    System.out.println("What time during the week will you be staying- weekday or weekend?");
    String dayOfWeek = myConsole.readLine();

    boolean summer = season.equals("summer");
    boolean weekend = dayOfWeek.equals("weekend");

    if ( summer && weekend ) {
      System.out.println("Cha-Ching! We making bank on you, dawg!");
    } else if ( summer || weekend ) {
      System.out.println("You gonna need some cash, boy. But are you you sure that this is the most convenient time for you to travel?");
    } else {
      System.out.println("You are a miser; is it really worth it to travel in the middle of the week, in the middle of the winter...Really?");
    }
  }
}
