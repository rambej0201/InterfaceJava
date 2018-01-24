interface InTwo{
	void m1();
	void m2();
	void m3();
	void m4();
}

abstract class TestOne implements InTwo{
	public void m1(){System.out.println("m1 method from class TestOne");}
}
abstract class TestTwo extends TestOne{
	public void m2(){System.out.println("m2 method from class TestTwo");}
}
abstract class TestThree extends TestTwo{
	public void m3(){System.out.println("m3 method from class TestThree");}
}
class TestFour extends TestThree{
	public void m4(){System.out.println("m4 method from class TestFour");}
	public static void main(String[] argv){
		InTwo i2 = new TestFour();
		i2.m1();
		i2.m2();
		i2.m3();
		i2.m4();
	}
}