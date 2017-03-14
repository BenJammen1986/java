import java.io.Console;
  public class Hotel {
    public static void main(String[] args){
      Console myConsole = System.console();

      System.out.println("In what season are you booking a stay: summer or winter?");
      String season = myConsole.readLine();

      System.out.println("On the weekend, or a weekday?");
      String dayOfWeek = myConsole.readLine();

      boolean summer = season.equals("summer");
      boolean weekend = dayOfWeek.equals("weekend");

      if ( summer && weekend ) {
        System.out.println("It's busy...and expensive during these dates. You sure?");
      } else if ( summer || weekend ) {
        System.out.println("Your stay is probably going to be little expensive- but not awful!");
      } else {
        System.out.println("It's not a peak time; you may actually get a reasonable rate!");
      }
    }
  }
