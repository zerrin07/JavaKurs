package ihtiyactan;

public class App {

	public static void main(String[] args) {
		Musteri m = new Musteri();
		Kullanici k = new Kullanici();
		System.out.println(m.getName());
		System.out.println(m.getSurname());
		
		m.setName("aarif");
		m.setSurname("celik");
		System.out.println(m.getName());
		System.out.println(m.getSurname());
		
		m.kaydet();
		
		
		System.out.println(k.getSifre());
		
	
		
		System.out.println(m.Kullanici.Id);
	}

}
