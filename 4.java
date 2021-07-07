//file name should be named as juliandate.java

package Java;
import java.util.*;
public class juliandate {
public Scanner in=new Scanner(System.in);
	
	public void main()
	{
		int Month;
		int day;
		int juliandate;
		
		System.out.printf("\nEnter Month :");
		Month=in.nextInt();
		
		System.out.printf("\nEnter Day  :");
		day=in.nextInt();
		
		juliandate=(Month-1)*30+day;
		
		System.out.printf("\nJulian Date :%d", juliandate);
	}
	
	juliandate()
	{
	
		System.out.printf("\n************");
		System.out.printf("\n************");
		System.out.printf("\n**	    	 ");
		System.out.printf("\n**          ");
		System.out.printf("\n*********	 ");
		System.out.printf("\n*********   ");
		System.out.printf("\n**	    	 ");
		System.out.printf("\n**          ");
		System.out.printf("\n************");
		System.out.printf("\n************");
	}
}
