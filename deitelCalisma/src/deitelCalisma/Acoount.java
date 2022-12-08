package deitelCalisma;

public class Acoount {   // entity class
 private String name;
 private double balance;
 //constructor oluşturalım
 public Acoount(String name, double balance)
 {
	 this.name = name;
	 if(balance >0.0)
	 {
		 this.balance = balance;
	 }
 }
  //bakiyeye sadece geçerli bir tutar girme koşulu için metot oluşturuyoruz.
 

 public void deposit(double mevduatTutari)
 {
	 if(mevduatTutari > 0.0)
	 {
		 balance = balance + mevduatTutari;
	 }
 }
 public double getBalance()
 {
	 return balance;
 }
 

 public void setName(String name)
 {
	 this.name = name;
 }
 public String getName()
 {
	 return name;
 }
}


