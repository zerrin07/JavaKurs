package CALİSMA;

import java.util.Scanner;
class Main {  
  public static void main(String args[]) { 
    Scanner input = new Scanner(System.in);
    System.out.print("e sabitini hhesaplamak için bir rakam giriniz:");
    int deger = input.nextInt();
    double islem=0;
    int toplam=0;
    double e;
    int i =1;
    
   
    while(i<=deger)
    {

         
         toplam =toplam +i;
         islem = toplam *(1/1);
        
        i++;
        
    }
     e = islem;
     
    System.out.print("e sabitinin değeri :" + (e+1));
    
    
    
    
    
    
  } 
}