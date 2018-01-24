interface InOne 
{
	public int m1(int a, int b);
	public String m2(String x, String y);

}

class InOneEx implements InOne
{
	public int m1(int a, int b){
		int c = a+b;
		return c;
	}

	public String m2(String x, String y){
		String z = x + " " + y;
		return z;
	}

	public static void main(String[] args) 
	{
		InOneEx p = new InOneEx();

		System.out.println(p.m1(25, 24));
		System.out.println(p.m2("Raghuram", "Bejjanki"));
		System.out.println("Hello World!");
	}
}
