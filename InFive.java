interface InFive {
	int a = 10;
}


class Ran implements InFive{
	void m1(){System.out.println("Interface InFive variable a value is "+InFive.a);}
	public static void main(String[] argv){
		Ran r1 = new Ran();
		r1.m1();
	}
}

/*This is an example for delaring variables in an interface. To access these variables we should consider interface reference. These
variables are public static final so we can not reassign and we should consider interface reference to access these variables*/