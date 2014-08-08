package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fibonacci {
	public static void main(String[] args) throws Exception {  
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.print("Enter value of n: ");  
		String st = reader.readLine();  
		int num = Integer.parseInt(st);    
		int f1=-1,f2=1,f3 ;
		for(int i=1;i<=num;i++){   
			f3=f1+f2; 
			System.out.println(f3);      
			f1=f2;      
			f2=f3;     
			   
			}
		}
}
