interface InThree {
	interface In{
		void m1();
	}
}

class TestFive implements InThree,In{
	void m1(){System.out.println("m1 method from InThree and In1 interfaces");}
	
	public static void main(String[] argv){
		TestFive t1 = new TestFive();
		t1.m1();
	}
}

/*An example for nested interface interface in interface*/