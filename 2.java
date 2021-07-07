//file name should be named as faherenheit.java

package Java;
import java.util.*;
public class fahrenheit {
	
	fahrenheit()
	{
		double fahre;
		double c;
		System.out.printf("\nEnter Fahrenheit:");
		Scanner b=new Scanner(System.in);
		fahre=b.nextDouble();
		c=5.0/9*(fahre-32);
		
		System.out.printf("\nAnswer is :%.2f",c);
	}

}
