package leetcodeProblems;

import java.util.Scanner;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter columnTitle here");
		String columnTitle = sc.nextLine();
		int n= columnTitle.length();
		int columnTitleNumber=0;
	      for(int i=0;i<n;i++){
	        columnTitleNumber += (Math.pow(26,n-i-1))*(Character.getNumericValue(columnTitle.charAt(i))-9);
	      }
		System.out.println(columnTitleNumber);  
	}
}
