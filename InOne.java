interface InOne{ //by default it's an abstract class
	void m1(); //by default it's an abstract & public method
	void m2(); //by default it's an abstract & public method
	void m3(); //by default it's an abstract & public method
}

//above or functionalities of the project
//below we should declare implementations of the above functionalities

class Test implements InOne{
	public void m1(){System.out.println("This is m1 method");}
	public void m2(){System.out.println("This is m2 method");}
	public void m3(){System.out.println("This is m3 method");}
	
	public static void main(String[] argv){
		InOne i1 = new Test();
		i1.m1();
		i1.m2();
		i1.m3();
	}
}