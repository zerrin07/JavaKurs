package OrnekCalisma;
import java.util.Scanner;
public class OrnekCalisma {
	//girilen değer 5 e bölünüyorsa true bölünmezse false çıkar.
	public static void main(String[] args) {
		
			Scanner input=new Scanner(System.in);
			for(int i=0;i<10;i++)
			{
				System.out.print("sayi" + (i+1) + ":");
				System.out.println(isDivisible(input.nextInt()));
				
			}
		}
	
	public static boolean isDivisible(int n)
	{
		return (n%5==0);
		
	}
	
	
		
		
		
		
		
	
	

}
