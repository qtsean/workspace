package clock;

import java.util.Scanner;

public class Clock {
	
	public Clock(int a, int b, int c)
	{
	hour = new Display(a);
	minute = new Display(b);
    second = new Display(c);
	}
	private Display hour ;
	private Display minute;
	private Display second ;
	public void start()
	{
		while(true)
		{
			second.Increase();
			if(second.GetValue() == 0)
				{
					minute.Increase();
					if(minute.GetValue() == 0)
					{
						hour.Increase();
					}
				}
				
		
			System.out.printf("%02d:%02d:%02d\n",hour.GetValue(),minute.GetValue(),second.GetValue());
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Clock clock = new Clock(in.nextInt(),in.nextInt(),in.nextInt());
		clock.start();
	}

}
