
public class Main
{
	public static void main(String[] args) {
	int i =0;
	int j=0;
	for (i = 0, j = 0; i < 10; i++) 
	{
	j += i;
	

	}
		System.out.println(j);   ////45 çıkar
	
	for (i = 0, j = 1; i < 10; i++) 
	{
	    j += j;
	}
	System.out.println(j);  ///1024 çıkar
	for (j = 0; j < 10; j++) 
	{
	    j += j;
	}
	System.out.println(j);  ///15 çıkar
	for (i = 0, j = 0; i < 10; i++) 
	{
	j += j++;
	}
	System.out.println(j); ///0 çıkar 
	
}


}