import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input= new Scanner(System.in);
	    //tam sayıların dizisinde ortalama bulmak
	    int[] tamSayilar = new int[10];
	    for(int i=0;i<tamSayilar.length;i++)
	    {
	        System.out.println(i +".sayiyi giriniz:");
	        tamSayilar[i] = input.nextInt(); 
	    }
		double avg = average(tamSayilar);
        System.out.println("Average = " + avg);
        //çift sayıların dizisinde ortalama bulmak
        System.out.print("çift sayılar için");
        double[] cifttamSayilar = new double[10];
        for(int j=0;j<cifttamSayilar.length;j++)
        {
            System.out.println(j + ".sayiyi giriniz:");
            cifttamSayilar[j] =input.nextDouble();
        }
        double avg2 = average(cifttamSayilar);
        System.out.println("average= " + avg2);
        
         
		
   }
   public static double average(int[] tamSayilar)
   {
       int sum =0;
       for(int i=0;i<tamSayilar.length;i++)
       {
           sum += tamSayilar[i];
       }
       return (double) sum / tamSayilar.length;

   }
   public static double average(double[] cifttamSayilar)
   {
       double ortalama =0;
       for(int i=0;i<cifttamSayilar.length;i++)
       {
           if(i % 2==0)
          {
              ortalama += cifttamSayilar[i];
          }
          
       }
       return (double) ortalama/cifttamSayilar.length;
   }
}
