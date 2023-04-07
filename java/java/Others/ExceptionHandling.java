package Others;
public class ExceptionHandling {
	public static void main(String[] args) {
		arrayException();
		try {
			int a = 100/0;
		} catch(ArithmeticException e) {
			System.out.println("Exception="+e);
		} 
	}
	public void arrayException() {
		int a[10];
		try {
			a[10] = 5;
		} catch()
	}
}