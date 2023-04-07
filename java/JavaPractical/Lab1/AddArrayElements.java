// Dynamic array expands its required size at runtime
import java.util.ArrayList;
import java.util.Scanner;
public class AddArrayElements {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<Integer>();
    public ArrayList<Integer> getArrayInput() 
    {
        char ch='y';
        System.out.println("Enter The elements of array.");
        while(Character.toUpperCase(ch) != 'N') {
            arr.add(in.nextInt());
            System.out.println("Any More number?(y/n)");
            ch = in.next().charAt(0);
        }
        return arr;
    }
    public int add(ArrayList<Integer> arr)
    {
        int sum=0;
        for(int i = 0; i<arr.size(); i++) {
            System.out.println("Array["+i+"] = " + arr.get(i));
            sum += arr.get(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        AddArrayElements newElt = new AddArrayElements();
        newElt.arr = newElt.getArrayInput();
        int sum = newElt.add(newElt.arr); 
        System.out.println("Sum = " + sum);
    }
}