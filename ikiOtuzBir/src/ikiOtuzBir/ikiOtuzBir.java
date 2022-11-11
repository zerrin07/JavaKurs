package ikiOtuzBir;
import java.util.Scanner;
public class ikiOtuzBir {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] dizi = {4,6,1,-2,6,2,9,-3,0};
        int enKücük =0;
        int enBüyük =0;
		for(int i=0;i<dizi.length;i++)
		{
			if(dizi[i] >enBüyük)
			{
				enBüyük =dizi[i];
			}
			if(dizi[i]<enKücük)
			{
				enKücük = dizi[i];
			}
		}
		System.out.println("dizinin en  buyuk elemani:" + enBüyük);
		System.out.print("dizinin en kucuk elemani" + enKücük);
		
	
		
		
	
	   
	  
		
	}
	
	}