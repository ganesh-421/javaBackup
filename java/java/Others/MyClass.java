package Others;
import java.util.Scanner;

import Packages.ArithOperations;
import Packages.MatricsOp;
public class MyClass {
    public static void main(String[] args) {
        // declarations
        ArithOperations operations = new ArithOperations();
        double[][] c = new double[3][4];
        Scanner sc =  new Scanner(System.in);
        MatricsOp matOp = new MatricsOp();
        System.out.println("Enter some numerical value");
        // Initializations
        int x = sc.nextInt();
        int y = sc.nextInt();
        double[][] a = {
            {1, 2, 3, 4}, 
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        double[][] b = {
            {1, 2, 3, 4}, 
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        c = matOp.add(a, b);
        // Display 
        System.out.println("\t\tArithmatic Operations:");
        System.out.print("Sub=>" + operations.sub(x, y));
        System.out.print("\tSum=>" + operations.add(x, y));
        System.out.print("\tProd=>" + operations.mul(x, y));
        System.out.print("\tDiv=>" + operations.div(x, y) + "\n\n");
        System.out.println("\t\tMatrix Operations:");
        System.out.println("\t\tMat A:"); matOp.printMatrics(a);
        System.out.println("\t\tMat B:"); matOp.printMatrics(b);
        System.out.println("\t\tMat C=A+B:"); matOp.printMatrics(b);
        sc.close();
    }
}
