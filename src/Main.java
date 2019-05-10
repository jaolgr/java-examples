import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        comparing();
    }



    /**
     * Reads 2 numbers from keyboard and tells which one is bigger
     */
    public static void comparing() {

        // Leer de teclado
        Scanner scanner = new Scanner(System.in);
        System.out.print("tell me the first number: ");
        int num1 = Integer.parseInt( scanner.nextLine() );
        System.out.print("tell me the second number: ");
        int num2 = Integer.parseInt( scanner.nextLine() );

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
        int quantity = Integer.parseInt( scanner.nextLine() );
        System.out.print("tell me the price: ");
        double price = Double.parseDouble( scanner.nextLine() );
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
