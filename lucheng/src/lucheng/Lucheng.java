package lucheng;

import java.util.ArrayList;
import java.util.Scanner;

public class Lucheng {
public ArrayList<String> cn = new ArrayList<String>();
public void Getname(String s){
	cn.add(s);
}
public int Getzuobiao(String s){
	return cn.indexOf(s);
}
	public static void main(String[] args) {
		int shuliang = 0;
		Scanner in = new Scanner(System.in);
		Lucheng lc = new Lucheng();
		String s = in.next();
		while(!s.equals("###"))
		{
			lc.Getname(s);
			s = in.next();
			shuliang++;
		}
		int[][] a = new int[shuliang][shuliang];
		for(int i=0; i<shuliang; i++){
			for(int j=0; j<shuliang; j++){
				a[i][j] = in.nextInt();
			}
		}
		int x = lc.Getzuobiao(in.next());
		int y = lc.Getzuobiao(in.next());
		System.out.println(a[x][y]);
	}

}
