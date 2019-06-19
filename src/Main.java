import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Importado para el indexOf

//Importado de internet
import java.lang.Math; // importing java.lang package


public class Main {

  public static void main(String[] args) throws Exception {

    longWord();

    System.out.println(longWord());


  }


  /**
   * Write a function that takes a string that contains words separated by spaces
   * and returns the longest word.
   */
  public static String longWord() {

    String words = "shoes hat jeans t-shirt trousers jacket socks";
    String[] array = words.split(" ");

    int i =0;
    int length = array.length;
    String longest = array[i];

    while (i < length) {

      int length1 = longest.length();
      int length2 = array[i].length();

      if (length1 < length2) {
        longest = array[i];
      }
      i++;
    }

    return longest;
  }

  /**
   * Read numbers from a .txt file. If the numbers are positive (they are Income) or if the numbers are
   * negative (they are Expenses). The program sums all the Incomes and Expenses separately.
   * Finally the results are shown in another .csv file.
   */
  private static void IncomeExpenseFromFile() throws Exception {

    Scanner scanner = new Scanner(new File("IncomeExpenses.txt"));

    //scanner.hasNext()
    int sumIncome = 0;
    int sumExpenses = 0;

    while (scanner.hasNext()) {

      int n = Integer.parseInt(scanner.nextLine());

      if (n > 0){
        sumIncome += n;

      } else {
        sumExpenses += n;

      }
    }

    System.out.println("sumExpenses = " + sumExpenses);
    System.out.println("sumIncome = " + sumIncome);

    PrintWriter writer = new PrintWriter(new File("Production.csv"));
    writer.println("Name,Income,Expenses");
    writer.println("sumExpenses," + sumIncome + "," + sumExpenses);
    writer.close();
  }

  /**
   * Import ans export files
   */
  private static void callSumListFromFile() throws Exception {

    Scanner scanner = new Scanner(new File("prices.txt"));

    //scanner.hasNext()
    int sum = 0;

    while (scanner.hasNext()) {

      int n = Integer.parseInt(scanner.nextLine());
      sum += n;
    }

    System.out.println("sum = " + sum);

    PrintWriter writer = new PrintWriter(new File("result.csv"));
    writer.println("Nombre,Cantidad");
    writer.println("suma," + sum);
    writer.close();
  }

  /**
   * Declares a String, print the number of characters, splits the String by the operator ,
   * declares the length of an array and compares the number of the characters. If the word is
   * longer than 5 characters it will be printed
   */
  public static void splitString () {

    String text = "pera,manzana,arroz blanco,banana,melon";

    System.out.println(text.length());

    String[] array = text.split(",");

    int i = 0;

    int length = array.length;

    while (i < length) {

      String s = array[i]; //HINTS Refactor Extract Variable / Inline Variable

      if (s.length() > 5){
        System.out.println(s);
      }
      i++;

    }
  }

  /**
   * Creates an array of 3 positions, Assign a value to the array position, Assign a value
   * to the array position, Gets the size of the array, Obtains the value of the array index
   */

  public static void sumArray (){

    int[] array; // Declares an array

    array = new int[3]; // Creates an array of 3 positions

    array[0] = 6; // Assign a value to the array position
    array[1] = 9;
    array[2] = 2;

    int sum = 0;
    int i = 0;

    while (i < array.length){ // Gets the size of the array

      sum += array[i]; // Obtains the value of the array index
      i++;

    }
    System.out.println("sum = " + sum);
  }

  /**
   * Add numbers in a list and sum and show them
   */
  private static void callSumList() {

    List<Integer> list; //Declaring

    list = new ArrayList<>(); //Creating and Assigning

    list.add(6);
    list.add(8);
    list.add(2);

    list.set(1,9); //Changes the value using the index and the new value

    int total = sumList(list);

    System.out.println("total = " + total);
  }

  /**
   * Create a function int fib(int n) which calculates the Fibonacci number n.
   *
   * fib(1) is 1
   * fib(2) is 1
   * fib(3) is 2
   * fib(4) is 3
   * fib(5) is 5
   */

  /**
   * //   ADD THIS TO THE MAIN CALL
   int x = fib(3);
   System.out.println("fib 3 es " + x);

   System.out.println( fib(1) );
   System.out.println( fib(2) );
   System.out.println( fib(3) );
   System.out.println( fib(4) );
   System.out.println( fib(5) );
   System.out.println( fib(6) );
   System.out.println( fib(7) );

   //

   */
    public static int fib(int n) {

    if (n == 1) {
      return 1;
    }

    int a = 0;
    int b = 1;

    int i = 2;

    while (i <= n){

      int temp = a + b;
      a = b;
      b = temp;

      i++;
    }

    return b;
  }

 public static void fib() {

   Scanner scanner = new Scanner(System.in);

   System.out.println("Write the number of iterations: ");

   int end = Integer.parseInt(scanner.nextLine());

   int result = fib(end);

   System.out.println("// result = " + result);

 }

  /**
   * Given a list of integers returns the sum of all numbers
   */
  public static int sumList(List<Integer> list) {

    int sum = 0;
    int i = 0;

    while (i < list.size()) {

      int num = list.get(i);
      sum += num;
      i++;
    }

    return sum;
  }

  /**
   * Write a function that creates a list with the even numbers from 2 to 10.
   * After that, iterate the list, sum the numbers and show the result. It should be 30.
  */

  public static void sumPairNum() {

    List<Integer> list = new ArrayList<>(); // create an empty list of integers

    int n = 2;

    while (n <= 10){
      list.add(n);
      n = n + 2;
    }


    int sum = 0;
    int i = 0;
    while (i < list.size()) {
      int num = list.get(i);
      sum += num; //the same as sum = sum + num;
      i++; // the same as i = i + 1;
    }
    System.out.println("sum = " + sum); //shortcut soutv


    int sum2 = 0;
    for (int num : list) { //shortcut iter
      sum2 += num;
    }
    System.out.println("sum2 = " + sum2);
  }


  /**
   * Ask numbers to the user. Add those numbers into a list until the user enters a zero. Then
   * display the list.
   *
   * If the function just displays the list, the return type is void. But you can also try to return
   * the list, so the return type is List<Integer>.
   */
  public static void numbersList() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Write numbers to print a list: ");

    List<Integer> list = new ArrayList<>(); // create an empty list of integers

    int number = Integer.parseInt(scanner.nextLine());

    while (number != 0) {

      list.add(number);

      number = Integer.parseInt(scanner.nextLine());
    }

    // Do not print here like before
    // System.out.println(list);

    List<String> order = new ArrayList<>(); // create an empty list of strings

    int i = 0;

    while (i < list.size()) {

      int orderNum = list.get(i);

      //List in a row showing the index of entered number followed by the entered numbers in a brackets
      // At the end of this list there is a list in brackets with the numbers ordered from small to big
      System.out.print(list.indexOf(orderNum) + "[" + list.get(i) + "], ");

      i = i + 1;

      // get, add, size, añadir indices e imprimir en orden en la lista
    }

    Collections.sort(list);
    System.out.println("//" + list);

    //System.out.println(i);

    //acabar System.out.println(list.indexOf(1));

  }

  public static void numbers() {
    String msg = "hello";

    List<Integer> numbers = new ArrayList<>(); // create an empty list of integers

    List<String> words = new ArrayList<>(); // create an empty list of strings

    words.add("hat");
    words.add("shoes");
    words.add("shirt");

    String second = words.get(1);

    System.out.println(second);

    System.out.println(words.size() + " words");

    System.out.println(words);

    String w = "end";

    if (w.equals("end")) {
      System.out.println("iguales");
    }
  }

  /**
   * Power using a function
   */
  private static void doPower() {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the base number: ");
    int base = Integer.parseInt(scanner.nextLine());
    System.out.print("Enter the exp number: ");
    int exp = Integer.parseInt(scanner.nextLine());

    int y = power(base, exp);

    System.out.println("y = " + y);
  }


  /**
   * returns base powered to exp. E.g power(2, 4) returns 16.
   */
  public static int power(int base, int exp) {

    int result = 1;

    int i = 1;

    while (i <= exp) {

      result = result * base;
      i = i + 1;
    }

    return result;
  }


  /**
   * Function pow () found in internet
   */
  public static void GFG() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the base number: ");
    int base = Integer.parseInt(scanner.nextLine());
    System.out.println("Enter the power number: ");
    int i = Integer.parseInt(scanner.nextLine());

    double nan = Double.NaN;
    double result;

    // Here second argument is NaN,
    // output will be NaN
    result = Math.pow(base, i);
    System.out.println(result);

  }

/**
 public static int factorial1 (int n) {

 int result = 1;
 int i = 1;
 while (i <= n) {

 result = result * i;
 i = i +1;

 return result;
 }

 }

 */

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




