import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	 double w =0;
	 int C=0;
	 Scanner input = new Scanner(System.in);
	 System.out.print("Sıcaklığı(T) giriniz:(celcius cinsinden):");
	 double T = input.nextInt();
	 System.out.print("rüzgar hızını(v) giriniz:(mph cinsinden):");
	 int v = input.nextInt();
	 T = C * 1.8 + 32;
	 if(Math.abs(T)<50 && v<120 && v>3)
	 {
	     w = 35.74 + (0.6215*T) + ((0.4275*T) - 35.75) * Math.pow(v,0.16);
	     
	     System.out.print("w değeri:"+ w);
	     
	 }
	 else
	 {
	     System.out.print("değerlerin dışında girildi.");
	 }
	     

	}
}
