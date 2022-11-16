package LabDay1;

import java.util.Scanner;

public class Binaray {

	public static void main(String[] args) {
//		Solution S1 = new Solution();
//		int Num1 =S1.solvethis(100);
//	    System.out.println(" Longest Gap is :"+Num1);
//	
		System.out.println("Enter the number");
	   Scanner sc = new Scanner(System.in);
	  // System.out.println("Enter the number");
	   int N = sc.nextInt();
	   
	 //  Solution S2 = new Solution();
		int Num2 =Solution.solvethis(N); // Calling method by class name without creating object
	    System.out.println(" Longest Gap is :"+Num2);
	    sc.close();
	
	}

		
		
	}


