import java.io.Console;

public class LeapYear {
  public static void main(String[] args){
    Console myConsole = System.console();
    System.out.println("Give us your birth year and we will show you the leap years you've lived through!");
    Integer birthYear = Integer.parseInt(myConsole.readLine());
    for ( Integer year = birthYear; year < 2017; year++ ){
      if ( year % 4 == 0 ) {
        System.out.println(year);
      }
    }
  }
}
