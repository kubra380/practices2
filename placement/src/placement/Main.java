package placement;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int n;  
		Scanner scanner=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		//reading the number of elements from the that we want to enter  
		n=scanner.nextInt();  
		//creates an array in the memory of length n 
		int[] array = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		//reading array elements from the user   
		array[i]=scanner.nextInt(); 
		
		System.out.println(i+1+".elements:"+array[i]);
		
		}  
		System.out.println("Array elements are: ");  
		// accessing array elements using the for loop  
		for (int i=0; i<n; i++)   
		{  
			
		Arrays.sort(array);
		System.out.print(array[i]+" ");
		
		}  
		
		scanner.close();
	}

}
