import java.util.Scanner;
import java.util.ArrayList;
public class Inverse {
	private ArrayList<Integer> shu = new ArrayList();
	private void add(int x){
		shu.add(x);
	}
	private int get(int index){
		return shu.get(index);
	}
	public static void main(String[] args) {
		int count = 0;
		double[][] a = null ;
		Scanner in = new Scanner(System.in);
		System.out.println("分别输入行数和列数");
		int M = in.nextInt();
		int N = in.nextInt();
		Inverse num = new Inverse();
		do	{
				num.add(in.nextInt());
				count++;
			}while(count<M*N);
		for(int i=0; i<M; i++){
			for(int j=0; j<N; j++){
				a[i][j]=num.get(i*M+j);
			}
		}
	}

}
