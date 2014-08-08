package test;

import java.util.Scanner;

public class revtri2 {
	 public static void main(String [] args){
		 System.out.println("Enter value of n:");
		    Scanner scan=new Scanner(System.in);
		    int n=scan.nextInt();
		 for(int i=n;i>=1;i--){
			 
		for(int j=1;j<=n-(i-1);j++)
			 System.out.print(" ");
			 for(int k=i;k>=1;k--){
		
				  System.out.print(" "+ i);
				  
				
			 }
			 System.out.println(" ");
			 }
		 }
}
