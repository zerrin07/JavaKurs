import java.util.Scanner;
class Main {  
  public static void main(String args[]) { 
      Scanner input = new Scanner(System.in);
      System.out.print("birinci sayiyi giriniz:");
      int x = input.nextInt();
      System.out.print("ikinci sayıyı giriniz:");
      int y= input.nextInt();
      System.out.print("üçüncü sayıyı giriniz:");
      int z = input.nextInt();
      if(x == y && y==z && x==z)
      {
          System.out.print("3 sayıda birbirine eşittir.");
          
      }
      else{
          System.out.print("3 sayıda eşit değildir.");
      }
   
    
     
      
      
      
      
      
  } 
}