package classes;

import java.util.*; // 'this *' imports all the 'util.' classes

public class ClassExample {

  public static void main(String[] args) {

    //productsBasicExample();

    /**productsLists();
    int x = abs(-8);
    x *= 2;
    System.out.println(x);
     */

    ProdList();

    ReturnAList("electronic","electronic", "music", "music","pharma","pharma");

   }

  /** Recieves a list of products ( about different types)
   and returns a list of the products of its kind */

  public static List ReturnAList(String a, String b, String c, String d, String e, String f){

    Product oven = new Product("oven", "electronic");
    Product microwave = new Product("microwave", "electronic");
    Product speaker = new Product("speaker", "music");
    Product guitar = new Product("speaker", "music");
    Product paracetamol = new Product("ibupropheno", "pharma");
    Product ibupropheno = new Product("paracetamol", "pharma");

    List<Product> products = new ArrayList<>();

    products.add(oven);
    products.add(microwave);
    products.add(speaker);
    products.add(guitar);
    products.add(ibupropheno);
    products.add(paracetamol);

    List<Product> selectedProducts = new ArrayList<>();

    for (Product product : products) {
      if (product.type.equals("music")) { //to compare Strings use always equals()
        selectedProducts.add(product);
      }
    }
    return selectedProducts;

  }


  /** Recieves a list of products ( about different types)
   and prints the name of the products of its kind */

  public static void ProdList(){

   Product oven = new Product("oven", "electronic");
   Product microwave = new Product("microwave", "electronic");
   Product speaker = new Product("speaker", "music");
   Product guitar = new Product("speaker", "music");
   Product ibupropheno = new Product("ibupropheno", "pharma");
   Product paracetamol = new Product("paracetamol", "pharma");

   List<Product> products = new ArrayList<>();

   products.add(oven);
   products.add(microwave);
   products.add(speaker);
   products.add(guitar);
   products.add(ibupropheno);
   products.add(paracetamol);

    for (Product product : products) {
      if (product.type.equals("pharma")) { //to compare Strings use always equals()
        System.out.println(product.typeOfProduct());
      }
    }

  }

  /**
   * prints the absolute value of a
   */
  public static int abs(int a) {

    int num;

    if (a < 0) {
      num = -a;
    } else {
      num = a;
    }

    return num;
  }

  private static void productsLists() {

    Product table = new Product("ikea table", 50, "home");
    Product chair = new Product("ikea chair", 20, "home");
    Product iphone = new Product("iphone", 1000, "electronic");
    Product tv = new Product("TV", 800, "electronic");
    Product pencil = new Product("Pencil", 2, "office");

    List<Product> products = new ArrayList<>(); // create an empty list of products

    products.add(table);
    products.add(chair);
    products.add(iphone);
    products.add(tv);
    products.add(pencil);

    for (int i = 0; i < products.size(); i++) {

      Product product = products.get(i);
      if (product.type.equals("home")) { //to compare Strings use always equals()
        System.out.println(product.description());
      }
    }

    for (Product product : products) {
      if (product.type.equals("home")) { //to compare Strings use always equals()
        System.out.println(product.description());
      }
    }

  }

  private static void productsBasicExample() {

    Product p1;
    p1 = new Product();

    Product p2 = new Product();

    p1.name = "iphone";
    p1.price = 1000;

    p2.name = "cookie";
    p2.price = 3;

    System.out.println(p1.description());
    System.out.println(p2.description());

    Product p3 = p1;

    System.out.println(p3.description());

    p3.price += 100;

    System.out.println(p1.description());
  }

}
