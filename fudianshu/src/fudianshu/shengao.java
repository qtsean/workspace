package fudianshu;

import java.util.Scanner;

public class shengao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner in=new Scanner(System.in);
		int BJC;
		int ULC;
		BJC=in.nextInt();
		if(BJC>=800)
		{
			ULC=BJC-800;
		}
		else
		{
			ULC=BJC+1600;
		}
		System.out.println(ULC);
	}

}
