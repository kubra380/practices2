import java.util.Scanner;

public class Main {
	//metot kullanarak üs alma
	  static int powerCalculate(int base, int exponent) {
	        if (exponent == 0) {
	            return 1;
	        } else {
	            return base * powerCalculate(base, exponent - 1);
	        }
	  }
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter base: ");
	        int base = scanner.nextInt();
	        System.out.print("Enter exponent: ");
	        int exponent = scanner.nextInt();
	        System.out.println("Sonuç: " + powerCalculate(base, exponent));

	}

}
