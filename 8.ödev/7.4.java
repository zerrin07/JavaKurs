import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	
	      int ortalamaAltı=0;
	      int ortalamaUstu=0;
	     
	     int toplam =0;
	     Scanner input= new Scanner(System.in);
	     int[] not = new int[4];
	     for(int i=0;i<not.length;i++)
	     {
	         System.out.println((i+1) + "birinci notu giriniz:");
	         not[i] = input.nextInt();
	         toplam += not[i];
	         double ortalama = toplam / not.length;
	         
	      if(not[i]>ortalama || not[i]== ortalama)
	      {
	         ortalamaUstu++;
	      }
	      else if(not[i]<ortalama)
	      {
	          ortalamaAltı++;
	          
	      
	      
	      }
	         
	     }
	     System.out.println("ortalamanın üstünde " + ortalamaUstu + "kadar sayı vardır.");
	     System.out.println("ortalamanın altında " + ortalamaAltı + "kadar sayı vardır.");
	     


}
}