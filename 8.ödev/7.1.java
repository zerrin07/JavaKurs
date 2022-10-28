import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int enbuyuk =0;
        int[] not = new int[4];
        System.out.println();
        for( int i=0;i<not.length;i++)
        {
            System.out.print(i + ".notu giriniz:");
            not[i] = input.nextInt();
        }
        for(int i=0;i<not.length;i++)
        {
            if(not[i] > enbuyuk) {
                enbuyuk = not[i];
               
            }
            
        }
        for(int i=0;i<not.length;i++)
        {
                if(not[i]>=enbuyuk-10)
                {
                    System.out.print(i + "=A ");
                }
                else if(not[i]>=enbuyuk-20)
                {
                    System.out.print(i + "=B ");
                }
                else if(not[i]>=enbuyuk-30)
                {
                    System.out.print(i + "=C ");
                }
                else if(not[i]>=enbuyuk-40)
                {
                    System.out.print(i+ "=D ");
                }
                else
                {
                    System.out.print(i +"=F");
                }
                
             
                System.out.println(not[i]);
            
            }
            
       
}
}

