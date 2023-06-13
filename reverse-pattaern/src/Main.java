import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find pattern: ");
        int number = input.nextInt();
        Creator(number, number, -1);
        input.close();
    }
	
    static void Creator(int constantNumber, int variableNumber, int sign)
    {
        if(variableNumber > constantNumber) 
        	return;
        if(variableNumber < 1) sign *= -1;
        System.out.print(" " + variableNumber + " ");
        
        Creator(constantNumber, variableNumber  + sign * 5, sign);
    }
   
	}


