import java.util.Scanner;
public class Leap{ 	
    static boolean leapyear(int year){
		if (year%400==0||(year%4==0&&year%100!=0))
		{
			return true;
		}
		  else
		 {
			return false;
		 }
	}
	
	public static void main (String[]args){
		Scanner obj = new Scanner(System.in);
		System.out.print("enter a year:");
		int year = obj.nextInt();
		
		if (leapyear(year))
		{
			System.out.println(year + " is a leap year");
		}
		  else
		  {
			  System.out.println(year + "is not a leap year");
		  }
	}
}
			
			
			
	