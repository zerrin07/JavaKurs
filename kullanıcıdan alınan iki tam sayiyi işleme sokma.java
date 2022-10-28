package test;
import java.util.Scanner;
public class test {
    
	//kullanıcıdan alınan iki tam sayiyi işleme sokma 2.15
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("birinci sayiyi giriniz:");
	int n1 = input.nextInt();
	System.out.print("ikinci sayiyi giriniz:");
	int n2 = input.nextInt();
	
    int toplam = (n1*n1) + (n2*n2);
    int fark = (n1*n1) - (n2*n2);
	  
	System.out.println("sayilarin toplami:" +  toplam);
	System.out.print("sayilarin farki:" + fark );
	
	
	
	}

}
