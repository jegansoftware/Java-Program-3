//file name should be named as Volume_of_cone.java
package Java;
import java.util.*;
public class Volume_of_cone {
	protected double v;
	protected double r;
	protected double h;
	private Scanner in=new Scanner(System.in);
	
	public void cone()
	{
		System.out.printf("\nEnter Height:");
		h=in.nextDouble();
		
		System.out.printf("\nEnter Radius:");
		r=in.nextDouble();
		
		v=1.0/3*(22.0/7)*r*r*h;
		System.out.printf("Volume of cone : %f",v);
	}
}
