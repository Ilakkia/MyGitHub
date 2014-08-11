package practise;
//The java compiler adds public and abstract keywords before the interface method and 
//public, static and final keywords before data members.

interface FirstInterface {
	
	//private int a; --Illegal modifier; only public, static & final are permitted
	String Hi="Hi";//implicitly public, static and final
	
	//void display(){} -- method with implementation is not allowed in interface'
	void sayHello();//methods are implicitly abstract and public
	
	}

interface SecInterface {
	void sayGoodbye();
	}

//An interface can extend more than one interface but interfaces cannot implement another interface.
interface ThirdInterface extends FirstInterface {
	void display();
	}


//All methods of interface must b implemented by this class
//A class can implement more than one interface
public class InterfaceImpl implements ThirdInterface, SecInterface{


	public static void main(String[] args) {
	
   //FirstInterface FI=new FirstInterface();-- Cannot instantiate interface
		InterfaceImpl a = new InterfaceImpl();
		a.sayHello();
		a.sayGoodbye();
		a.display();
	}

	
	public void sayHello() {
	System.out.println("Say Hello method of FirstInterface is implemented");
	System.out.println("Constant defined in First Interface: "+FirstInterface.Hi);
	}

	public void sayGoodbye() {
	System.out.println("Say Good bye Method of SecInterface is implemented");
		
	}


	public void display() {
	System.out.println("Display method of ThirdInterface is implemented");
		
	}

}
