import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner input=new Scanner(System.in);
	    double[] array = new double[10];
	    for(int i=0;i<array.length;i++)
	    {
	        
	        System.out.println(i + "sayiyi giriniz:");
	        array[i] = input.nextDouble();
	    }
	    double enKucuk = min(array);
        System.out.println("min = " + enKucuk);

	    
	    
	} 
	  public static double min(double[] array)
	  {
	      double enKucuk = array[0];
	      for(double i: array)
	      {
	          if(enKucuk > i)
	          {
                enKucuk = i;
	          }
          }
          return (double) enKucuk;
          
        
        
	  }
	  
	  }
  

