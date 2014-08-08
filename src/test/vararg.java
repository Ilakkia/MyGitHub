package test;

public class vararg {
	
	void display(String... a){
	int count=a.length;
	System.out.println("Vararg method invoked");
	System.out.println("Number of Arguments:"+ " "+count);
	}
	
	void display1(int a, int b, String...strings ){
		int c=a+b;
		System.out.println("Result:" + " "+c);
		for(String s:strings)
		System.out.println(s);	
	}
	
public static void main(String... args){
	vararg g=new vararg();
	g.display();
	g.display("one");
	g.display("one","two","three","four");
	g.display1(1, 2, "onearg");
	g.display1(7, 2, "onearg","twoarg");
	g.display1(10, 2);	
}
}