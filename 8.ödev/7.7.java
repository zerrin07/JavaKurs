import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int[] sayilar = new int[9];
	Random r = new Random();
	for(int i=0;i<sayilar.length;i++)
	{
	   sayilar[i]=r.nextInt(100);
	   System.out.println((i+1)+"ler " + "=" +sayilar[i]);
       
	}
	
	
	
}
}