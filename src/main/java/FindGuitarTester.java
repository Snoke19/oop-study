import java.util.List;

public class FindGuitarTester {

  public static void main(String[] args) {

    Inventory inventory = new Inventory();
    initInventory(inventory);

    Guitar watErinLikes = new Guitar("", Builder.FENDER, "fender", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 0);

    List<Guitar> guitars = inventory.search(watErinLikes);

    if (!guitars.isEmpty()) {
      for (Guitar guitar : guitars) {
        System.out.println("Erin, you might like this " +
          guitar.getBuilder() + " " + guitar.getModel() + " " +
          guitar.getType());
      }
    } else {
      System.out.println("Sorry, Erin, we have nothing for you!");
    }
  }

  private static void initInventory(Inventory inventory) {
    inventory.addGuitar("V95693", "Alder", "Fender", "Stratocastor", "electric", "Alder", 1499.95);
  }
}
