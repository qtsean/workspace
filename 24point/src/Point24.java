import java.util.Scanner;

public class Point24 {
	public static String fuhao(int n){
		String s = "1";
		if(n==1)
			s = "+";
		if(n==2)
			s = "-";
		if(n==3)
			s = "*";
		if(n==4)
			s = "/";
		return s;
	}

	public static void main(String[] args) {
		double a ;
		double b ;
		double c ;
		double d ;
		int i = 1;
		int j = 1;
		int k = 1;
		int x = 0;
		int y = 0;
		int z = 0;
		double s = 0;
		double r = 0;
		double t = 0;
		System.out.println("请输入4个1~13的数字");
		Scanner in = new Scanner(System.in);
		do
		{
			a = in.nextDouble();
			b = in.nextDouble();
			c = in.nextDouble();
			d = in.nextDouble();
			if((a>13||a<0)||(b>13||b<0)||(c>13||c<0)||(d>13||d<0))
				System.out.println("数字超出范围，请重新输入");
		}
		while((a>13||a<0)||(b>13||b<0)||(c>13||c<0)||(d>13||d<0));
		for(i=1; i<=4; i++){
			s = a;
			x = 0;
			if(i==1){
				s = s+b;
			
			}
			if(i==2){
				s = s-b;
				
			}
			if(i==3){
				s = s*b;
				
			}
			if(i==4){
				s = s/b;
				
			}
			for(j=1; j<=4; j++){
				y = 0;
				if(j==1){
					r = s+c;
					
				}
				if(j==2){
					r = s-c;
					
				}
				if(j==3){
					r = s*c;
					
				}
				if(j==4){
					r = s/c;
					
				}
						for(k=1; k<=4; k++){
							z = 0;
							if(k==1){
								t = r+d;
							
							}
							if(k==2){
								t = r-d;
								
							}
							if(k==3){
								t = r*d;
								
							}
							if(k==4){
								t = r/d;
								
							}
							if(abs(t-24)<0.0001){
								System.out.println("("+"("+a+fuhao(i)+b+")"+fuhao(j)+c+")"+fuhao(k)+d+"=24");
								
							}
					
				}
			}
		}
		
		

	}

	private static double abs(double d) {
		if(d>=0)
			d=d;
		else
			d=-d;
		return d;
	}


}
