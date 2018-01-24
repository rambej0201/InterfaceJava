interface InSix{
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
	void m6();
	void m7();
	void m8();
	void m9();
}
//adopter class InAaru to override methods with empty implementations
//adopter class contains empty implementations of all interface methods to overcome problem with interface
class InAaru implements InSix{
	public void m1(){}
	public void m2(){}
	public void m3(){}
	public void m4(){}
	public void m5(){}
	public void m6(){}
	public void m7(){}
	public void m8(){}
	public void m9(){}
}
//extending adopter class to override required m4, m8 methods 
class F extends InAaru{
	public void m4(){System.out.println("m4 method from adopter class inherited class F");}
	public void m8(){System.out.println("m8 method from adopter class inherited class F");}
	
	public static void main(String[] argv){
		F f1 = new F();
		f1.m4();
		f1.m8();
	}
}