package diyizhou;

import java.util.Scanner;
class Fraction{
	int a;
	int b;
	Fraction(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	void print()
	{
		int a1=a;
		int b1=b;
		if(a%b==0)
		{
			System.out.println(a1/b1);
		}
		else
		{
			for(int i=2; i<=a&&i<=b;i++)
			{
				if(a%i==0&&b%i==0)
				{
					a1=a1/i;
					b1=b1/i;
				}
			}
			System.out.println(a1+"/"+b1);
		}
	}
	Fraction plus(Fraction F)
	{
		
		int c = F.GetA();
		int d = F.GetB();
		if(b==d)
		{
			int e = a+c;
			int f = b;
			for(int i=2; i<=e&&i<=f;i++)
			{
				if(e%i==0&&f%i==0)
				{
					e=e/i;
					f=f/i;
				}
			}
			Fraction G = new Fraction(e,f);
			return G;
		}
		else
		{
			int e = a*d+c*b;
			int f = b*d;
			for(int i=2; i<=e&&i<=f;i++)
			{
				if(e%i==0&&f%i==0)
				{
					e=e/i;
					f=f/i;
				}
			}
			Fraction G = new Fraction(e,f);
			return G;
		}
	}
	Fraction multiply(Fraction F)
	{
		int m = F.GetA();
		int n = F.GetB();
		int fenzi = a*m;
		int fenmu = b*n;
		for(int i=2; i<=m&&i<=n;i++)
		{
			if(fenzi%i==0&&fenmu%i==0)
			{
				fenzi=fenzi/i;
				fenmu=fenmu/i;
			}
		}
		Fraction G = new Fraction(fenzi,fenmu);
		return G;
	}
	int GetA()
	{
		return a;
	}
	int GetB()
	{
		return b;
	}
//	void test()
//	{
//		System.out.println(a+b);
//	}
}
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
		
	}

}
