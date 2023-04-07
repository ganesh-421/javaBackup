package Packages;
public class MatricsOp {
    public void printMatrics(double[][] c) {
        for(int i = 0; i < c.length; i++) {
            System.out.print("\t");
            for(int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
    public double[][] add(double x[][], double y[][]) {
        try {
            if(x.length != y.length)
                throw new Exception("Size incompatibility");
        } catch (Exception e) {
            System.out.println(e);
        }        
        double[][] z = new double[x.length][x[0].length];
        for(int i = 0; i < x.length; i++) {
            for(int j = 0; j < x[0].length; j++) {
                try {
                    if(x[i].length != y[i].length)
                        throw new Exception("Size incompatibility");
                } catch (Exception e) {
                    System.out.println(e);
                }
                
                z[i][j] = x[i][j] + y[i][j];
            }
        }
        
        return z;        
    }
    public static void main(String[] args) {
                
    }
}
