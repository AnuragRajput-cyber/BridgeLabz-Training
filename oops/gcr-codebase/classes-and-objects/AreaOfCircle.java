package oops;
import java.math.*;

 class Circle{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	public void areaCircle() {
		System.out.printf("Area of circle: %.4f",(Math.PI*radius*radius));
	}
	
	public void circumfrenceCicle() {
		System.out.printf("Circumfrence of Area: %.4f",(2*Math.PI*radius));
	}
}
public class AreaOfCircle {
	public static void main(String[] args) {
		Circle circle =new Circle(5.0);
		System.out.println("-----------circle's Area and Circumfrence------------");
		circle.areaCircle();
		System.out.println();
		circle.circumfrenceCicle();
	}
}
