package Others;
import java.util.ArrayList;
import java.util.Scanner;

public class OddEvenDigitCount {
    Scanner sc =  new Scanner(System.in);
    public ArrayList<Integer> getCount(int num)
    {
        ArrayList<Integer> data = new ArrayList<Integer>();
        int ev = 0, od = 0;
        while(num != 0) {
            int extracted  = num % 10;
            if(extracted % 2 == 0)
                ev++;
            else if(extracted % 2 == 1) 
                od++;
            num /= 10;
        }
        System.out.println("The number of Even digits = " + ev + "; Odd digits = " + od);
        data.add(0, ev);
        data.add(1, od);
        return data;
    }
    public int reverse(int num) 
    {
        int rev = 0;
        while(num != 0) {
            int extracted  = num % 10;
            rev = rev*10+extracted;
            num /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        OddEvenDigitCount obj1 = new OddEvenDigitCount();
        System.out.println("Enter the number");
        int num = obj1.sc.nextInt();
        obj1.getCount(num);
        System.out.println("Reverse of "+num+" = "+obj1.reverse(num));        
    }
    
}
