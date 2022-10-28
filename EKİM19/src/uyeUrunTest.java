import java.util.*;
public class uyeUrunTest {
   public static void main(String[] args)
   {
	   urun urun = new urun();
	   urun.setFiyat(10);
	   urunManager.save(urun);
	   
	   uye uye = new uye();
	   uye.setName(6);
	   uyeManager.save(uye);
	   
	   System.out.println(uye.getName());
	   System.out.println(urun.getFiyat());
	   
	  
	   
	   uye uyex = uyeManager.getById(1);
	   ArrayList<uye> name = uyeManager.getAlluye();
	   
	   urun urunx = urunManager.getBById(1);
	   ArrayList<urun> fiyat = urunManager.getAllurun();
	   
	   
	  
   }
}
