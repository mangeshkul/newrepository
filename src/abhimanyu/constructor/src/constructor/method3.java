package constructor;

public class method3 {
public void triangle() {
	for(int a=1;a<=4;a++) {
		for(int b=1;b<=a;b++) 
		{
			System.out.print("*");
		}
	System.out.println();	
	}
}
public static void triangle1() {
	for(int a=4;a>=1;a--) {
		for(int b=1;b<=a;b++) 
		{
			System.out.print("*");
		}
		System.out.println();
}
}	
public static void main(String[] args) {
	method3 mmk=new method3();
	mmk.triangle();
	mmk.triangle1();
	mmk.triangle();
	mmk.triangle1();
	method3.triangle1();
}

	
	
	
}
	
	
	
	


