package shapes;

public class MyPic {
	public static void main(String[] args) 
	{
		Picture pic = new Picture(1000,1000);
		Circle c1 = new Circle(320,40,80);
		Rectangle r1 = new Rectangle(100, 100, 100, 100);
		Rectangle r2 = new Rectangle(200, 300, 200, 200);
		Triangle t1 = new Triangle(100, 100, 200, 100, 150, 50);
		Line l1 = new Line(0,205,400,2000);
		Circle c2 = new Circle(200,200,50);
		pic.add(c1);
		pic.add(r1);
		pic.add(t1);
		pic.add(l1);
		pic.add(c2);
		pic.draw();	
	}
}
