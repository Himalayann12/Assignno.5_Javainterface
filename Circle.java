package Interface;

public class Circle implements Shape {
	private int radius;
	
	public int getRadius() {
		return radius;
	}
 public void setRadius(int radius) {
	 this.radius=radius;
 }
 
 public void getArea() {
	 Double pi=3.12;
	 System.out.println("enter radius for Circle");
	 radius=sc.nextln();
	 
	 Double areaCircle = pi *(radius*radius);
	 System.out.println("Area of Circle is:"+areaCircle);
 }
}
