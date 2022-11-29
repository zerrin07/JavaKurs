package ihtiyactan;

public class Kullanici {
	public int Id;
	private int Sifre;
	public int MusteriId;
	public Musteri Musteri = new Musteri();
	
	
	public int getSifre()
	{
		return Sifre;
	}
	public void setName(int Sifre) {
		this.Sifre = Sifre;
	}
	
	
	public void kaydet() {
    String stmt = "INSERT INTO public.\"Kullanici\"(\"MusteriId\", \"Sifre\") VALUES(" + this.MusteriId + ", \'" + this.Sifre + "\') RETURNING \"Id\"";
    this.Id = DBOperation.Save(stmt);
	}
}

