interface Satya
{
	public String child(String x, String y);
	public int childSerial(int a);
	public String grandChild(String p, String q);
	public int grandChildSerial(int b);
}
class Tyson implements Satya  
{
	public String child(String x, String y){
		String z = x+" "+y;
		return z;
	}
	public int childSerial(int a){
		return a;
	}
	public String grandChild(String p, String q){
		String r = p+ " " +q;
		return r;
	}
	public int grandChildSerial(int b){
		return b;
	}

	public static void main(String[] args) 
	{
		System.out.println("Child & GrandChild of Satya");
		Tyson t = new Tyson();
		System.out.println(t.child("Srikanth", "Thipirishetty"));
		System.out.println("Serial Number is "+t.childSerial(3));
		System.out.println(t.grandChild("Babbulu","Babbulu"));
		System.out.println("Serial Number is "+t.grandChildSerial(2));

		Tyson s = new Tyson();


	}
}
