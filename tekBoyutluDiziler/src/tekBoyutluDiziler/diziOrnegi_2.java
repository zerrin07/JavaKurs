package tekBoyutluDiziler;
import java.util.Scanner;
public class diziOrnegi_2 {

	public static void main(String[] args) {
		//string türünde dizi oluşturuyoruz ve sözlük olarak sıralıyoruz.
		Scanner input= new Scanner(System.in);
		String[] isimler = {"ayse","fatma","hayriye","osman","burak"};
		for(int i=0;i<isimler.length;i++)
		{
			System.out.print(" "+isimler[i]);
		}
		String temp;
		
		for(int i=0;i<isimler.length;i++)
		{
			for(int j=0;j<isimler.length;j++)
			{
				if(isimler[i].compareTo(isimler[j])<0){
					temp = isimler[i];
					isimler[i] = isimler[j];
					isimler[j] = temp;
				}
				
			} 
		}
		System.out.println();
		for(int i=0;i<isimler.length;i++)
		{
			System.out.print(" " + isimler[i]);
		}

	}

}
