package deitelCalisma;
import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
	    Acoount account1 = new Acoount("fatma", 50.00);
	    Acoount account2 = new Acoount("ayse",00.00);
	    
		
	    System.out.printf("%s,balance degeri: %.2f", account1.getName(),account1.getBalance());
	    System.out.printf("\n%s,balance degeri: %.2f", account2.getName(),account2.getBalance());
	    
	    System.out.println("\n------------------------------");
	    System.out.print("lutfen account1 icin mevduat tutarini giriniz:");
	    double mevduatTutari = input.nextDouble();
	    System.out.printf("%nhesap1 bakiyesine %.2f ekleniyor%n%n", mevduatTutari);
	    account1.deposit(mevduatTutari);
	   
	    //bakiyeleri göster
	    
	    System.out.printf("%s,balance degeri: %.2f", account1.getName(),account1.getBalance());
	    System.out.printf("\n%s,balance degeri: %.2f", account2.getName(),account2.getBalance());
	    
	    
	    System.out.print("\nlutfen account2 icin mevduat tutarini giriniz:");
	     mevduatTutari = input.nextDouble();
	    System.out.printf("%nhesap2 bakiyesine %.2f ekleniyor%n%n", mevduatTutari);
	    account2.deposit(mevduatTutari);
	    
	    
	    System.out.printf("%s,balance degeri: %.2f", account1.getName(),account1.getBalance());
	    System.out.printf("\n%s,balance degeri: %.2f", account2.getName(),account2.getBalance());
	    
	    
	    
	    
	    
	   /* System.out.println("lütfen adinizi giriniz:");
	    String ad = input.nextLine();
	    account1.setName(ad); //name değişkeninin değerini değiştirdik
	    System.out.println();
	    
	    
	    System.out.printf("name is:"+account1.getName()); */
	}
	
}