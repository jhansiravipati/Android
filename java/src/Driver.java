
import java.util.Scanner;

public class Driver {
	public static void main (String [] args) {
		Scanner s= new Scanner(System.in);
		
		int price= s.nextInt();
		int size= s.nextInt();
		double thickness = s.nextDouble();
		boolean audiojack=s.nextBoolean();
		String name=s.next();
		String brand = s.next();
		
		s.close();
		
		AndroidPhone a= new AndroidPhone();
		
	a.buildPhone(price,size,thickness,audiojack,name,brand);

		a.myAwsomePhone();
		
		
		
	}

}
