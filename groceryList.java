
public class GroceryList {
  public static void main(String[] args){
    String[] myGroceryList = { "apples", "oranges", "burgers", "caviar" };
    Integer[] groceryItemPrices = { 3, 4, 6, 25 };
    for ( String groceryItem : myGroceryList ) {
      System.out.println(groceryItem);
    }
    Integer total = 0;
    for ( Integer price : groceryItemPrices ) {
      total += price;
    }
    System.out.println("Your total shopping bill will be: $" + total);
  }
}
