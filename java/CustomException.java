import java.util.Scanner;

public class CustomException extends Exception {
    public CustomException(String msg) {
        super(msg);
    }

    public static void vote(int age) {
        try {
            if (age < 18)
                throw new CustomException("Invalid age");
            System.out.println("Vote your dream leader");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Dont vote on masu vat");
        }
    }

    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        age = sc.nextInt();
        vote(age);
        System.out.println("Good bye");
        sc.close();
    }
}
