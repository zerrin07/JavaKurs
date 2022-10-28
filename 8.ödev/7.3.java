import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 int a = 0;
	int[] d= new int[10];
	int bakildimi[] = new int [10]; 
	System.out.println("1 ile 100 arasındaki tam sayıları giriniz:");
	
	for(int i=0;i<d.length;i++)
	{ 
	         System.out.print((i+1) + ". Sayıyı gir = > ");
             d[i] = input.nextInt();
	   
	}
	
      int bakilansayi = 0;
         for (int i = 0; i < d.length; i++) {
             
             for (int j = 0; j < d.length; j++) {
                 if(d[i]==bakildimi[j])
                 {
                     a++;
                 }
             }
             if(a == 0 )
             {
                 int sayiAdedi = 0;
                 for (int t = 0; t < d.length; t++) {
                     if(d[i]== d[t])
                     {
                         sayiAdedi ++;
                     }
                 }
                 bakildimi[bakilansayi] = d[i];
                 bakilansayi ++;
                 System.out.println(d[i] + " Sayısından " + sayiAdedi + " tane var ");
                 
             }       
             }

}
}