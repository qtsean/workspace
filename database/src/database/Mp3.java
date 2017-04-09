package database;

public class Mp3 extends Item{
	private int nop;

	public Mp3(int nop,String title, int playingTime, String comment) {
		super(title, playingTime, false, comment);
		this.nop = nop;
	}

	public static void main(String[] args) {
		
		}
		public void print(){
			System.out.print(nop+"  ");
			super.print();
		
		}

	}


