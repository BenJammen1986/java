import java.io.Console;

public class Grade {
  public static void main(String[] args){
    Console myConsole = System.console();
    System.out.println("What letter grade did you get on your last test?");
    String grade = myConsole.readLine();
    if (grade.equals("A") || grade.equals("B")) {
      System.out.println("Great job! Keep up the good work!");
    } else if (grade.equals("C")) {
      System.out.println("Ok. You could probably do better though, right?");
    } else if (grade.equals("D") || grade.equals("F")) {
      System.out.println("Ummmm...uh-huh. Not cool, man.");
    } else {
      System.out.println("Not sure if you understood the question...");
    }
  }
}
