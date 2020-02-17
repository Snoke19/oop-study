import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

  private List<Guitar> guitars;

  public Inventory() {
    this.guitars = new LinkedList<>();
  }

  public void addGuitar(String serialNumber, String builder, String model, String type, String backWood, String topWood, double price) {
    Guitar guitar = new Guitar(serialNumber, builder, model, type, backWood, topWood, price);
    this.guitars.add(guitar);
  }

  public Guitar getGuitar(String serialNumber) {
    for (Guitar guitar : guitars) {
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }

  public List<Guitar> search(Guitar searchGuitar) {

    List<Guitar> matchingGuitars = new LinkedList<>();

    for (Guitar guitar: guitars) {

      if (searchGuitar.getBuilder() != guitar.getBuilder()) continue;

      String model = searchGuitar.getModel().toLowerCase();
      if (!model.equals("") && !model.equals(guitar.getModel().toLowerCase())) continue;

      if (type != null && !type.equals("") && !type.equals(guitar.getType())) continue;

      if (backWood != null && !backWood.equals("") && !backWood.equals(guitar.getBackWood())) continue;
      
      if (topWood != null && !topWood.equals("") && !topWood.equals(guitar.getTopWood())) continue;

      matchingGuitars.add(guitar);
    }

    return matchingGuitars;
  }
}
