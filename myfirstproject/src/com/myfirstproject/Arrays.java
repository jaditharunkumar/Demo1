package com.myfirstproject;

public class Arrays {

	public static void main(String[] args) {
		        int[] numbers = {10, 20, 30, 40, 50};    
		        
/*Looping backwards (using index)
		                for (int i = numbers.length - 1; i >= 0; i--) {
		                    System.out.println(numbers[i]);
		                }
		            }*/
	        int i = 0;
	        while (i < numbers.length) {
	            System.out.println(numbers[i]);
	            i++;
	        }
	    }
	}
		       /* for (int num : numbers) {
		            System.out.println(num);
		        }*/


