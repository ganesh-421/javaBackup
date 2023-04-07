package Others;
import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of n1");
        int n1 = input.nextInt();
        System.out.println("Enter the value of n2");
        int n2 = input.nextInt();
        int prod = n1 * n2;
        float div = n1 / n2;
        int rem  = n1 % n2;
        int sum =  n1 + n2;
        int diff  = n1 - n2;
        System.out.println("Sum = " + sum); 
        System.out.println("product = " + prod); 
        System.out.println("Quationt = " + div); 
        System.out.println("remainder = " + rem); 
        System.out.println("Difference = " + diff); 
        FirstClass obj1 = new FirstClass();
        System.out.println("Please Enter your first name: ");
        String fname = input.next();
        System.out.print("Namaste ");
        obj1.nameFunction(fname);
    } 
}
