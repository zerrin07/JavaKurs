
public class Main {

	public static void main(String[] args) {
		
		RationalNumber a = new RationalNumber(60,300);
		RationalNumber b= new RationalNumber(5,300);
		int islem = ((a.getShare() * b.getDenominator() + b.getShare() * a.getDenominator()) / (a.getDenominator()*b.getDenominator()));
		System.out.println(islem);
		
		
		
		
		
		

	}
	

}
