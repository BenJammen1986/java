
import java.io.Console;

public class PetShelter {
  public static void main(String[] args){
    Console myConsole = System.console();
    Animal shelby = new Animal();
      shelby.mName = "Shelby";
      shelby.mAge = 2;
      shelby.mSpecies = "feline";
      shelby.mBreed = "lynx";


    Animal bert = new Animal();
      bert.mName = "Bert";
      bert.mAge = 5;
      bert.mSpecies = "canine";
      bert.mBreed = "Dalmatian";


    Animal jim = new Animal();
      jim.mName = "Jim";
      jim.mAge = 49;
      jim.mSpecies = "rodent";
      jim.mBreed = "guinea pig";


    Animal rupert = new Animal();
      rupert.mName = "Rupert";
      rupert.mAge = 108;
      rupert.mSpecies = "tortoise";
      rupert.mBreed = "old";


    Animal[] allAnimals = {shelby,bert,jim,rupert};
    for ( Animal eachAnimal : allAnimals ) {
      System.out.println("--------------------");
      System.out.println("Name: " + eachAnimal.mName);
      System.out.println("Age: " + eachAnimal.mAge);
      System.out.println("Species: " + eachAnimal.mSpecies);
      System.out.println("Breed: " + eachAnimal.mBreed);
    }
  }
}
