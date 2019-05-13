import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    String msg = "hello";

    List<String> words = new ArrayList<>(); // create an empty list of strings

    words.add("hat");
    words.add("shoes");
    words.add("shirt");

    String second = words.get(1);

    System.out.println(second);

    System.out.println( words.size() + " words");
  }

  /**
   * Factorial
   */
  public static int factorial(int n) {

    int result = 1;

    int i = 1;
    while (i <= n) {
      result = i * result;
      i = i + 1;
    }

    return result;
  }

  /**
   * Sum numbers from begin to end
   */
  public static int sumNumbers(int begin, int end) { // parameters that the function receives

    int result = 0;

    int i = begin;
    while (i <= end) {
      result = result + i;
      i = i + 1;
    }

    return result;
  }

  /**
   * Write numbers from begin to end
   */
  public static void printNumbers(int begin, int end) { // parameters that the function receives

    int i = begin;
    while (i <= end) {
      System.out.println(i);
      i = i + 1;
    }
  }

  /**
   * Create a fuction that asks my name, my age and returns a sentence that says: Hello (name) you
   * are (age) and apears the condition of "you are old" if the age is higher than 21 and "you are
   * young" otherwise.
   */
  public static void who() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("What is your name? ");
    String name = scanner.nextLine();
    System.out.print("How old are you? ");
    int age = Integer.parseInt(scanner.nextLine());

    String msg = "Hello " + name + ", since you are " + age + " you are ";

    if (age > 21) {
      System.out.println(msg + "old");
    } else {
      System.out.println(msg + "young");
    }
  }

  /**
   * Reads 2 numbers from keyboard and tells which one is bigger
   */
  public static void comparing() {

    // Leer de teclado
    Scanner scanner = new Scanner(System.in);
    System.out.print("tell me the first number: ");
    int num1 = Integer.parseInt(scanner.nextLine());
    System.out.print("tell me the second number: ");
    int num2 = Integer.parseInt(scanner.nextLine());

    if (num1 > num2) {
      System.out.println("The biggest is: " + num1);
    } else {
      System.out.println("The biggest is: " + num2);
    }
  }


  /**
   * Ask a quantity and price and calculates the total
   */
  public static void count() {

    // Leer de teclado
    Scanner scanner = new Scanner(System.in);
    //String line = scanner.nextLine();
    //int num = Integer.parseInt( scanner.nextLine() );
    //double num2 = Double.parseDouble( scanner.nextLine() );

    System.out.print("tell me the quantity: ");
    int quantity = Integer.parseInt(scanner.nextLine()); // We need to convert the String to an int
    System.out.print("tell me the price: ");
    double price = Double.parseDouble(scanner.nextLine());
    double total = quantity * price;
    System.out.println("the result is: " + total);
  }

  /**
   * Basic examples
   */
  public static void hello() {

    System.out.println("hello world");

    String name = "jaume";

    // type name = expression;
    String message = "hola " + name;

    // shortcut: sout
    System.out.println(message);

    //tipos de variables
    // String - texto
    // int - num enteros
    // double - num con decimales
    // boolean -  true/false

    int quantity = 3;
    double price = 1.25;
    double total = quantity * price;

    System.out.println("El total es: " + total);
  }

}
