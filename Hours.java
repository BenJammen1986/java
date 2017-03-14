import java.io.Console;

public class Hours {
  public static void main(String[] args) {
    Integer twoDays3 = getHours("two days ago");
    Integer yesterday3 = getHours("yesterday");
    Integer today3 = getHours("today");
    Integer totalHours3 = twoDays3 + yesterday3 + today3;
    if(totalHours3 > 1) {
      String stringTotal = Integer.toString(totalHours3);
      System.out.println("You have worked for " + stringTotal + " hours so far. Great job, you hard worker you!");
    } else {
      String stringTotal = Integer.toString(totalHours3);
      System.out.println("You have worked for " + totalHours3 + " hours so far. Lucy: you have some 'splaining to do!");
    }
  }
   public static Integer getHours(String day) {
    Console myConsole = System.console();
    System.out.println("How many hours did you work " + day + "?");
    Integer hours = Integer.parseInt(myConsole.readLine());
      return hours;
  }
}
