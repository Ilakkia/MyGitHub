package practise;

	//abstract class- cant create obj of a class
	// abstract classes cannot be final bcoz it has to inherited to implement its undefined methods
    abstract class AA{
    abstract void callme();//abstract method can only be defined by abstract class
	public void callmetoo(){
	System.out.println("This is a concrete method");
	}	
	}
	
	//abstract class may or may not contain abstract method
	abstract class BB extends AA{
	void display(){
		
	}
	}
	/*This class must implement the unimplemented abstract methods else shd define this class as abstract 
	so tht its child class will implement unimplemented methods*/
	//non abstract class
	//A class can extend only one class
	class CC extends BB{
	void callme(){
		System.out.println("Implementing A's abstract method");
	}
	}
	
	public class AbstractDemo {
		public static void main(String[] args) {
			
		//B b=new B();-- will get compilation error bcoz abstract classes cannot be instantiated
			CC c=new CC();
			c.callme();
			c.callmetoo();
			
			
}
}