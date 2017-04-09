
public class Vendingmachine {
	int price=100;
	int balance=0;
	int total;
	int money=200;
	void showBalance()
	{
		balance=money-price;
		System.out.println(balance);
	}
	Vendingmachine()
	{
		this.price=price;
	}
	Vendingmachine(int price)
	{
		this.price=price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vendingmachine vm = new Vendingmachine();
		vm.showBalance();
		Vendingmachine vm1 = new Vendingmachine(1000);
	}

}
