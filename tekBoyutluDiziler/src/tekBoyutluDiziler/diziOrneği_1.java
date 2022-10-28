package tekBoyutluDiziler;
import java.util.Scanner;
public class diziOrneği_1 {

	public static void main(String[] args) {
       //klavyeden girilen tek boyutlu diziyi sıralayalım küçükten büyüğe
		Scanner input = new Scanner(System.in);
	    int[] d = new int[5];
	    System.out.println("dizinin değerlerini giriniz:");
	    for(int i=0;i<d.length;i++)
	    {
	    	d[i]= input.nextInt();
	    }
		int temp;
	    for(int i=0;i<d.length;i++)
	    {
	    	for(int j=0;j<d.length-1-i;j++)
	    	{
	    		if(d[j] > d[j+1])
	    		{
	    			temp = d[j];
	    			d[j] = d[j+1];
	    			d[j+1] = temp;
	    		}
	    	}
	    }
	    for(int i=0;i<d.length;i++)
	    {
	    	System.out.print(d[i]);
	    }
	    

}

}