package abhimanyu;

public class constructor4 {
int a=12;
int b=15;
boolean c;
static  String d;
static double e=17;
public  void mmk1(int a,int b) 
{
	
	System.out.println(a*b);
	
}
public int mmk2(boolean n) 
{
	a=122;
	System.out.println(a);
return a;

}
public  void mmk3() 
{
	System.out.println(a);
}
 protected  void mmk4() 
{
	 d="velocity";
	 System.out.println(d);
}
public  double mmk5() 
{
	System.out.println(e);
	return e;
}
constructor4(String h)
{
	System.out.println(h);
}
constructor4(int x)
{
	System.out.println(x);
}
public static void main(String[] args) {
	

	
	constructor4 mmk2=new constructor4(10);
	System.out.println(mmk2);
	constructor4 mk=new constructor4("mangesh");
}



}
