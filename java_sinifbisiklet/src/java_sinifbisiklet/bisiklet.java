package java_sinifbisiklet;

public class bisiklet {

	int hiz =30;
	int vites =4;
	
	void VitesDegis(int yenideger)  
	{
		
		if(yenideger>vites) {
		HizArttir();
		vites = yenideger;
		}
		else if(yenideger<vites) {
		HizAzalt();	
		vites = yenideger;
		}
	}
	void HizArttir()
	{
		hiz +=1;
	}
	void HizAzalt()
	{
		hiz -=1;
	}

	

}
