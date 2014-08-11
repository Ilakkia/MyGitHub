package test;
class a{
a()	{
	System.out.println("No arg Constructor a");
}
a(int a,int b){
	int c=a+b;
	System.out.println("c in a= "+c);
}
void display()
{
	System.out.println("display in  a");
}
}
class b extends a{
	b()	{
		System.out.println("No arg Constructor b");
	}
	b(int a,int b){
		super(1,3);
		int c=a+b;
		System.out.println("c in b= "+c);
	}
	void display()
	{
		System.out.println("display in  b");
	}
}
class c extends b{
	c()	{
		this("in","c");
	
		System.out.println("No arg Constructor c");
	}
	c(String name){
		
		System.out.println("calling one agr constructor in "+name);
	}
	c(String a, String b){
		
		System.out.println("calling two agr constructor "+a +" "+b);
	}
	c(int a,int b){
		super(2,7);
		int c=a+b;
		System.out.println("c in c= "+c);
	}
	
	void display()
	{
		System.out.println("display in  c");
	}
}
public class constructor{
public static void main(String[] a)	{
	c c1=new c(2,3);
	c c2=new c();
	c2.display();
}
}