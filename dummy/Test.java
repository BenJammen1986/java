

public class Fighter {
  public int mAge;
  public int mFightRecord;
  public String mNickname;
  public String mFightStyle;

  public Fighter(int age,int fightRecord, String nickname, String fightStyle) {
    mAge = age;
    mFightRecord = fightRecord;
    mNickname = nickname;
    mFightStyle = fightStyle;
  }
}


  Fighter wrestler = new Fighter(32,45.2, "Fredo", "wrestler");


public boolean mAdopted;

  public Animal(String name, int weight, String breed, String species, boolean adopted){
    mName = name;
    mWeight = weight;
    mBreed = breed;
    mSpecies = species;
    mAdopted = adopted;
  }

  // After all the animal information has been displayed for the user:
  System.out.println("Enter the name of any animal you would like to adopt:")
  String petName = myConsole.readLine();

  public boolean adopt(String animalName){
    return ( animalName.equals(mName) );


  for (Animal eachAnimal : allAnimals ) {
    if ( eachAnimal.adopt(petName))
  }






// class Vehicles {
//   public int mYear;
//   public String mModel;
//   public String mBrand;
//   public int mMiles;
//   public int mPrice;
//
//   public Vehicle(int year, String brand, String model, int miles, int price) {
//     mYear = year;
//     mBrand = brand;
//     mModel = model;
//     mMiles = miles;
//     mPrice = price;
//   }
//
//   public boolean worthBuying(int maxPrice){
//     return (mPrice < maxPrice);
//   }
// }
//
//




















//
// import java.io.Console;
//
// public class Test {
//   public static void main(String[] args){
//     Console myConsole = System.console();
//
//     System.out.println("Please enter your birth year: ");
//     Integer birthYear = Integer.parseInt(myConsole.readLine());
//
//     System.out.println("You were alive during these leap years:");
//
//     for(Integer year = birthYear ; year < 2017 ; year++) {
//       if ( year % 4 == 0) {
//         System.out.println(year);
//       }
//     }
//   }
// }
