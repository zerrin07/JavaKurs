package ihtiyactan;

public class Musteri {
	public int Id;
	private String Name;
	private String Surname;
	public Kullanici Kullanici = new Kullanici();
	
	
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String Surname) {
		this.Surname = Surname;	
	}

	
	public void kaydet() {
		String stmt = "INSERT INTO public.\"Musteri\"(\"Name\", \"Surname\") VALUES(\'" + this.Name + "\', \'" + this.Surname + "\') RETURNING \"Id\"";
		this.Id = DBOperation.Save(stmt);
		Kullanici.MusteriId = this.Id;
		Kullanici.kaydet();
	}
}
