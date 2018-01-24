class InSeven implements Cloneable{
	int a = 5;
	int b = 10;
	
	public static void main(String[] argv) throws Exception
	{
		InSeven H = new InSeven();
		System.out.println(H.a); //object holds a = 5 value
		System.out.println(H.b); // object holds b = 10 value 
		InSeven H1= (InSeven)H.clone();
		//Created duplicate object through cloning process to get a=5, b=10 values after a=40, b=50 values
		//As part of cloning 'throw exception with "throws Exception" and implement class from Cloneable interface'
		H.a = 40; // a = 40 value added to object after b = 10 value
		H.b = 50; // b = 50 value added to object after a = 40 value
		System.out.println(H.a);
		System.out.println(H.b);
		System.out.println(H1.a);
		System.out.println(H1.b);
	}
}