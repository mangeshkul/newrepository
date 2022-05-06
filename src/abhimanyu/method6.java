package abhimanyu;

public class method6 {
int a=12;
int b=22;
public int xyz(int f,int g) 
{
	int c=f+g;
	System.out.println(c);
	return c;
	}

	public int xyz(int q) 
	{
		if(q>=50) 
		{
			System.out.println("good");
		}
		else 
		{
			System.out.println("bad");
		}
		
		return q;
	}
	public static void main(String[] args) {
		method6 obj=new method6();
	int y=	obj.xyz(27, 25);
	obj.xyz(y);
	}
}


