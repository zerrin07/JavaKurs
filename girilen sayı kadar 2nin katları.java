import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("n:");
		int n=input.nextInt();
		
		for(int i=0;i<n;i++)
		{
		   
		    int value =(int) Math.pow(2,i);
		    System.out.print(value +" ");
	 
		}
		  
		
	
		
		
	}
}
