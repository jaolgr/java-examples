package classes;

public class ClassExample {

  public static void main(String[] args) {

    int x = 5;
    x = x + 1;

    int y;
    y = x * 2;

    String s;
    s = "horse";

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
