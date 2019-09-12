package classes;

public class Product {

  // fields, properties, instance variable
  String name;
  int price;
  String type;
  boolean available;


  // constructors

  /** @deprecated prefer using {@link #Product(String, int, String)} */
  public Product() {

  }

  public Product(String name, int price, String type) {  //no tiene nombre y sólo se pone el tipo de retorno, que es el nombre de la classe

    // iniciamos todos los fields pero no es necesario que todos vengan como parametros
    this.name = name;
    this.price = price;
    this.type = type;
    this.available = true;

    // return this; // constructors have this implicit return

  } public Product(String name, String type) {  //no tiene nombre y sólo se pone el tipo de retorno, que es el nombre de la classe

    // iniciamos todos los fields pero no es necesario que todos vengan como parametros
    this.name = name;
    this.type = type;
    this.available = true;

    // return this; // constructors have this implicit return
  }

  // methods, functions

  public String description() {
    // 'this' se refiere al objeto sobre el que estas invocando la funcion mediante la estructura var.funcion()
    // La variable 'this' aparece en las funciones NO static
    return this.name + ": " + this.price + " €";

  } public String typeOfProduct() {
    // 'this' se refiere al objeto sobre el que estas invocando la funcion mediante la estructura var.funcion()
    // La variable 'this' aparece en las funciones NO static
    return this.name + ": " + this.type;
  }
}
