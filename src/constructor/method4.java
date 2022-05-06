package constructor;

public class method4 {
 	static int a=12;
 	static String b;
	 static int c=20;
	static boolean d;
public void mmk(int a,int b ) 
{
System.out.println(a*b);

}
public boolean mmk2(String g) 
{
	d=true;
	System.out.println(d);
	return d;	
	
}
public static int mmk3(char s) {
c=23;
System.out.println(c);
return c;
}
public static void mmk4(int t) 
{
	c=34;
	System.out.println(c);
	
}
public static void main(String[] args) {
	method4 obj=new method4();
	obj.mmk(12,14);//168
	obj.mmk2(null);
	method4. mmk4(10);
	method4.mmk3('w');
	System.out.println(d);
}


}

