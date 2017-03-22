import java.util.Scanner; // needed to receive input from the terminal

public class Test {
        public static void main(String[] args) {

                // prints "Hello, World!" to the terminal window.
                System.out.println("Hello, World!");

                // print numbers 1 - 10
                for (int i = 1; i <= 10; i++) {
                        System.out.println(i);
                }


                // print welcome statement.
                System.out.println("Welcome to my program!");

                // get input from user in terminal.
                System.out.print("What is your name?\t");
                Scanner reader = new Scanner(System.in);
                String name = reader.next();

                // print name
                System.out.print("Hello, ");
                System.out.println(name);
        }

}
