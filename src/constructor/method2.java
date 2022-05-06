package constructor;

public class method2 {
	int a=23;
	double b=25;
	boolean c=true;
	String d="mmhj";
	int e=34;
	static int p=12;
	static String q="jaggu";
	static boolean r=true;
	static int s=18;
	static float t=12;
	
	public void m1() 
	{
	int c=a*e;	//782
	System.out.println(c);
	}
	public String m2(int y) 
	{
	String f="mangesh";//mangesh
		System.out.println(f);
		return f;
	}
	public boolean m3(double d) 
	{
		boolean w=true;//true
		System.out.println(w);
		return w;
	}
	public double m4() //12.0
	{ 
	
		double j=12;
		System.out.println(j);
		return j;
	}
	public static int m5() //
	{
		int m=p*s;//216k
		System.out.println(m);
		return m;
	}
	public static boolean m6()
	{
		boolean g=true;
		
		return g;
	}
	public static void m7(boolean b) 
	{
		double l=34;
		System.out.println(l);
	}
	public static void main(String[] args) {
	method2 mmk=new method2();
	 mmk.m1();
	 mmk.m7(false);
	 boolean v= mmk.m3(12.4);
	 String w=mmk.m2(10);
	 double f=mmk.m4();
	 int t=mmk.m5();
	 System.out.println(t);
	 boolean r=mmk.m6();
	
	}
	public void triangle() {
		// TODO Auto-generated method stub
		
	}
}
