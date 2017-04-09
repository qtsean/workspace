import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World");
		Scanner in = new Scanner(System.in);
		//System.out.println("echo:"+in.nextLine());
		int amount;
		System.out.print("请输入票面");
		amount=in.nextInt();
		int price;
		System.out.print("请输入金额");
		price=in.nextInt();
		System.out.println(amount+"-"+price+"="+(amount-price));
	}

}
