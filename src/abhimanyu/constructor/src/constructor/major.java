package constructor;

public class major {
	int a;
	long b;
	String f;
double h;
major()
{
a=200;
b=300;
f="mangesh";
h=12.4;
}
major(int a)
{
a=2;
b=3;
h=3.4;
}
major(String q,double w,char s)
{
	 a=23;
	 b=21;
	 h=3.4;
}
public static void main(String[] args) {
major mmk=new major();
	System.out.println(mmk.a);
	System.out.println(mmk.h);
	System.out.println(mmk.b);
	System.out.println(mmk.f);
	
	major mmk1=new major(20);
	System.out.println(mmk1.a);
	System.out.println(mmk1.b);
	System.out.println(mmk1.h);
	System.out.println(mmk1.f);
	
	major mmk2=new major("mohanrao",123.45,'a');
	System.out.println(mmk2.a);
	System.out.println(mmk2.b);
	System.out.println(mmk2.h);
	System.out.println(mmk2.f);
}

}




