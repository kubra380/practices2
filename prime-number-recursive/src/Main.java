import java.util.Scanner;
public class Main {
	 static boolean isPrime(int number, int i){
	        // 0 and 1 are not prime numbers.
	        if(number==0 || number==1){
	            return false;
	        }  
	        // 2 is prime number. 
	        if(number==2){
	            return true;
	        }
	        else{
	            // If the number has a divisor, it must be equal to 1 and itself. Otherwise the number is not prime.
	            if(number%i==0){
	                if(i==1){
	                    return isPrime(number,i+1);
	                }else if(number==i){
	                    return true;
	                }else{
	                    return false;
	                }
	            } else{
	                return isPrime(number,i+1);
	            }
	        }
	 }
	public static void main(String[] args) {
		
		int number;
        System.out.print("Enter number : ");
        Scanner input=new Scanner(System.in);
		number=input.nextInt();
       if(isPrime(number,1)){
        System.out.println(number + " is prime number.");
       }else {
        System.out.println(number + " is not prime number.");
       }
       input.close();
	}

}
