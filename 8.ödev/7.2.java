import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int[] d = new int[10];
	for(int i=0;i<d.length;i++)
	{
	    d[i] = input.nextInt();
	}

	System.out.println("dizinin tersi:");
	for(int i=d.length-1;i>=0;i--)
	{
	    System.out.print(d[i]+ " ");
	}
       
}
}

