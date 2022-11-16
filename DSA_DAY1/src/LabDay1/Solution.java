package LabDay1;

import java.util.ArrayList;

public class Solution {
	
	
	public static int solvethis(int N) {
		
		String BinaryRepresentation = Integer.toBinaryString(N);
		
		System.out.println("Given Number is "+N+ "\nBinary Representation is : " +BinaryRepresentation);
		
		int longestzero =0;
		
		ArrayList<Integer> onesList = new ArrayList<Integer>();
		
		for(int i=0;i<BinaryRepresentation.length();i++) {
			if(BinaryRepresentation.charAt(i)== '0')
				continue;
			onesList.add(i);	
		}
		
		for (int i=0;i<onesList.size()-1;i++) {
			int NoOfZeroes = onesList.get(i+1)-onesList.get(i)-1;
			longestzero = Math.max(longestzero, NoOfZeroes);
		}
		
		return longestzero;
		
		
	}

	
	
	}

