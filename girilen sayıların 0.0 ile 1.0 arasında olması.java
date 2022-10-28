import java.util.Scanner;
class Main {  
  public static void main(String args[]) { 
      Scanner input = new Scanner(System.in);
      System.out.print("x:");
      double x = input.nextDouble();
      System.out.print("y:");
      double y = input.nextDouble();
     if(0.0<x && x<1.0&& 0.0<y && y<1.0)
      {
          System.out.print("true");
      }
      else{
          System.out.print("false");
      }
    
     
      
      
      
      
      
  } 
}