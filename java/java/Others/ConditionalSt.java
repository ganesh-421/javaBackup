package Others;
import java.util.Scanner;

public class ConditionalSt {
    public static void main(String args[]) {
        FirstClass obj1 = new FirstClass();
        obj1.nameFunction("Ganesh Adhikari");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Do you have voter card?(y/n): ");
        char vc = input.next().toUpperCase().charAt(0);
        boolean cardChecker = (vc == 'Y')?true:false;
        boolean ageChecker = (age >= 18)?true:false;
        if(cardChecker || ageChecker) {
            if(!cardChecker) {
                if(ageChecker) {
                    System.out.println("!!!Not elligible for Vote!!");
                    System.out.println("Please create your voter-card first.");
                }
            }            
        }
            
        else {
            int remAge = 18 - age;
            System.out.printf("Please wait for %d years to vote.", remAge);
        }

    }
}
