package classes;

public class Product {

  String name;
  int price;
  String type;
  boolean available;

  public String description() {
    // 'this' se refiere al objeto sobre el que estas invocando la funcion mediante la estructura var.funcion()
    // La variable 'this' aparece en las funciones NO static
    return this.name + ": " + this.price + " €";
  }
}
