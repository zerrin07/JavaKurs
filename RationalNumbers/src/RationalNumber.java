
public class RationalNumber {
	
private int share;
private int denominator;
private int i=2;
private int kucuk;

public RationalNumber(int share,int denominator )
{
	if (share > denominator) 
		
		  kucuk = Math.abs(denominator);
		  else kucuk = Math.abs(share);
		  while (i <= kucuk) {
		   if (share % i == 0 && denominator % i == 0) {
		   
			share /= i; 
			denominator /= i;
		    kucuk /= i;
		    i = 2; 
		   } else i++; 
		  }
	
		  this.share= share;
		  this.denominator = denominator;
		 
		
}

public int getShare() {
	return share;
}


public void setShare(int share) {
	this.share = share;
}


public int getDenominator() {
	return denominator;
}


public void setDenominator(int denominator) {
	if(denominator==0)
		denominator=1;
	
	this.denominator = denominator;
	
}
public String toString() {
	return String.format("%d/%d" ,share,denominator); 
	} 


}

