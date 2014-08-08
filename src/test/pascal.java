package test;

import java.util.Scanner;

public class pascal {

	public static void main(String[] args) {
		 System.out.println("Enter value of n:");
		    Scanner scan=new Scanner(System.in);
		    int n=scan.nextInt();
	        
		    for(int i=0;i<n;i++)
		      {
		         int c=1;
		         for(int j=0;j<n-i;j++)
		         {
		            System.out.print(" ");
		         }		 
		         for(int k=0;k<=i;k++)
		         {
		            System.out.print(" "+c);
		            c = c * (i - k) / (k+ 1);
		         }
		         System.out.println();
		        }
		   }
	}


