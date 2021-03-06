
import java.io.Console;

public class App {
  public static void main(String[] args){
    Console myConsole = System.console();

    Vehicle hatchback = new Vehicle(1994, "Subaru", "Legacy", 170000, 4000);
    Vehicle suv = new Vehicle(2002, "Ford", "Explorer", 100000, 7000);
    Vehicle sedan = new Vehicle(2015, "Toyota", "Camry", 50000, 30000);
    Vehicle truck = new Vehicle(1999, "Ford", "Ranger", 100000, 4000);
    Vehicle crossover = new Vehicle(1998, "Toyota", "Rav-4", 200000, 3500);

    Vehicle[] allVehicles = {hatchback, suv, sedan, truck};

    System.out.println("Welcome to our car dealership. What would you like to do? Enter one of the following options: All Vehicles or Search Price");

    String navigationChoice = myConsole.readLine();

    if (navigationChoice.equals("All Vehicles")){
      for ( Vehicle individualVehicle : allVehicles ) {
        System.out.println("-----------------");
        System.out.println( "Year: " + individualVehicle.mYear );
        System.out.println( "Brand: " + individualVehicle.mBrand );
        System.out.println( "Model: " + individualVehicle.mModel );
        System.out.println( "Miles: " + individualVehicle.mMiles );
        System.out.println( "Price: $" + individualVehicle.mPrice );
      }
    } else if (navigationChoice.equals("Search Price")){
        System.out.println("What is your maximum budget for a vehicle?");
        Integer userMaxBudget = Integer.parseInt(myConsole.readLine());
        System.out.println("Ok! Here's what we have in your price range:");
        for (Vehicle individualVehicle : allVehicles ) {
          if (individualVehicle.worthBuying(userMaxBudget)){
            System.out.println("-----------------");
            System.out.println( "Year: " + individualVehicle.mYear );
            System.out.println( "Brand: " + individualVehicle.mBrand );
            System.out.println( "Model: " + individualVehicle.mModel );
            System.out.println( "Miles: " + individualVehicle.mMiles );
            System.out.println( "Price: $" + individualVehicle.mPrice );
          }
        }
    } else {
      System.out.println("I'm sorry, we don't recognize your input");
    }
  }
}
