
import java.io.Console;

public class App {
  public static void main(String[] args){
    Console myConsole = System.console();

    Vehicle hatchback = new Vehicle();
      hatchback.mYear = 1994;
      hatchback.mBrand = "Subaru";
      hatchback.mModel = "Legacy";
      hatchback.mMiles = 170000;
      hatchback.mPrice = 4000;

    Vehicle suv = new Vehicle();
      suv.mYear = 2002;
      suv.mBrand = "Ford";
      suv.mModel = "Explorer";
      suv.mMiles = 100000;
      suv.mPrice = 7000;

    Vehicle sedan = new Vehicle();
      sedan.mYear = 2015;
      sedan.mBrand = "Toyota";
      sedan.mModel = "Camry";
      sedan.mMiles = 50000;
      sedan.mPrice = 30000;

    Vehicle truck = new Vehicle();
      truck.mYear = 1999;
      truck.mBrand = "Ford";
      truck.mModel = "Ranger";
      truck.mMiles = 100000;
      truck.mPrice = 4000;

    Vehicle[] allVehicles = {hatchback, suv, sedan, truck};

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
  }
}
