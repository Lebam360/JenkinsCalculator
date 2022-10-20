import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // Print welcome message
        System.out.println("welcome to the calculator");
        System.out.println("Enter a command:");

        boolean read = true;
        Calculator calculator = new Calculator();
        while(read) {
            // Using Scanner for Getting Input from User
            Scanner in = new Scanner(System.in);

            String s = in.next();
            if (s.equals("add")) {
                int a = in.nextInt();
                int b = in.nextInt();
                int c = calculator.add(a,b);
                System.out.println(c);
            }
            else if (s.equals("subtract")) {
                int a = in.nextInt();
                int b = in.nextInt();
                int c = calculator.subtract(a,b);
                System.out.println(c);
            }
            else if (s.equals("multiply")) {
                int a = in.nextInt();
                int b = in.nextInt();
                int c = calculator.multiply(a,b);
                System.out.println(c);
            }
            else if (s.equals("divide")) {
                int a = in.nextInt();
                int b = in.nextInt();
                int c = calculator.divide(a,b);
                System.out.println(c);
            }
            else if (s.equals("fibonacci")) {
                int a = in.nextInt();
                int c = calculator.fibonacciNumberFinder(a);
                System.out.println(c);
            }
            else if (s.equals("binary")) {
                int a = in.nextInt();
                String c = calculator.intToBinaryNumber(a);
                System.out.println(c);
            }
            else if (s.equals("exit")) {
                read = false;
            }
            else {  // make it easy to exit the code
                read = false;
            }
        }
    }



}
