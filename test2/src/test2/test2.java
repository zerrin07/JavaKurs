package test2;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		
	
	Scanner input= new Scanner(System.in);
	System.out.print("vize notunu giriniz:");
	int vize1= input.nextInt();
	System.out.print("2.vize notunu giriniz:");
	int vize2= input.nextInt();
	System.out.print("final notunu giriniz:");
	int fınal = input.nextInt();
    
	double notOrtalaması = (vize1 * 0.3) + (vize2 *0.3) + (fınal*0.4);
	
	if(notOrtalaması>50)
	{
		System.out.print("geçti");
		
		
	}
	else if(40<=notOrtalaması && 50>=notOrtalaması)
	{
		System.out.print("şartlı geçti");
				
	}
	else {
		
	}
	 System.out.print("kaldı");
	
	}

}
