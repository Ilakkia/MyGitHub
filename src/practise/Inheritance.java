package practise;
//Parent Class
 class a{
	public int c ;
	// No arg constructor
	a()	{
	System.out.println("No arg Constructor a");
	}
	//two arg constructor
	a(int a,int b){
		c=a+b;
	System.out.println("c in a= "+c);
	}
	
	//private fields & methods cannot b inherited by sub classes
	private void dis(){
	System.out.println("protected method dis in  a");
	}
}
//"Child class b" Inheriting "Parent class a"
 class b extends a{
	// No arg constructor
	b()	{
		System.out.println("No arg Constructor b");
	}
	//two arg constructor
	b(int a,int b){
		super(1,3);
		c=a+b;
		System.out.println("c in b= "+c);
	}
	
	void display(){
		System.out.println("display in  b");
	}
}
//"Child class c" Inheriting "Parent class a"
class c extends b{
	// No arg constructor
	c()	{
		this("in","c");// calls 2 string arg constructor within same class
	
		System.out.println("No arg Constructor c");
	}
	//Single arg constructor
	c(String name){
		
		System.out.println("calling one agr constructor in "+name);
	}
	//two string arg constructor
	c(String a, String b){
		
		System.out.println("calling two agr constructor "+a +" "+b);
	}
	//two int arg constructor
	c(int a,int b){
		super(2,7);//calls constructor wit 2 int arg in its immediate super class i.e, in class b.
		c=a+b;
		System.out.println("c in c= "+c);
	}
	
	void show()
	{
		System.out.println("show in  c");
	}
}

public class Inheritance{
public static void main(String[] a)	{
	c c1=new c(2,3);//calls constructor with two integer arg
	c c2=new c();//calls constructor with no arguments in c; before this default call will go to parent class no arg const by compiler
	c2.display();//method in parent class
	c2.show();//method in child class
}
}