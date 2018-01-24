class A{
	interface Xam{
		void m1();
	}
}

class B implements A.Xam{
	public void m1(){System.out.println("An example for declaring an interface in a class and implementing to another class");}
	public static void main(String[] argv){
		B b1 = new B();
		b1.m1();
	}
} 

/*This is an example for declaring an interface in a class and implementing the same interface to another class
Methods inside an interface are by default public*/
