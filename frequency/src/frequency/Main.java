package frequency;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// sayın freakasını(en çok tekrar eden) bulan program
	
		
	
	      int[] array = { 2, 3, 5, 4, 3, 1, 3, 2, 1, };
	      
	      //sorting an array
	      Arrays.sort(array);
	      
	      //declaring the variables
	      int i,j,count;
	      System.out.println("Array:"+Arrays.toString(array));
	      System.out.println("Frequency of elements:");
	      
	 
	      for(i=0; i<array.length; i++){
	    	  
	         count = 1;
	         for(j=i+1; j<array.length; j++){
	        	 
	            if(array[j] == array[i]){
	               count++;
	            } 
	            else {
	               break;
	            }
	         }
	         i=j-1;
	         if(count > 1){
	         
	            //printing the output
	            System.out.println(array[i] + " Dizide " + count+" kez tekrar etmiştir.");
	         }
	      }
	   }
	   
	}


