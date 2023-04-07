public class ArrayJava {
    
    public  int[] arr = new int[2];
    ArrayJava() {
        arr[0] = 1;
        arr[1] = 2;
    }
    public static void main(String[] args) {
        ArrayJava obj = new ArrayJava();
        for(int i=0; i<2; i++) {
            System.out.println(obj.arr[i]);
        }
    }
}
