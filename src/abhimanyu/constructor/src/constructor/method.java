package constructor;

public class method {
int p=20;
int q=30;
double x=45;
static int a=2;
static int z=23;
static String l="yyy";
static double w=12;
String r="kulka";
long e=24;
public void m1() {
	int c=p+q;
	System.out.println(c);
}	
public int m2() {
	int c=p-q;
	System.out.println(c);
	return c;
}
public String m3() {
	String z="mangesh";
	
	System.out.println(z);
	
	return z;
	
}
public long m4() {
	long d=p*q;
	System.out.println(d);
	return d;
}
public double m5() {
	double j=23;
	System.out.println(j);
	return j;}
	public static int  m6() {
		int n=a+z;
		System.out.println(n);
		return n;
}
public static void m7() {
	int x =a-z;
	System.out.println(x);
}
public static String m8() {
	String y="manges";
	System.out.println(y);
	return y;
}
public static void main(String[] args) {
	method mmk=new method();
		mmk.m1();
	
	
	
}

}