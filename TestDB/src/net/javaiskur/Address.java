package net.javaiskur;

public class Address{
	public int Id;
	public String Address; 
	public int City_Id;
	public int Customer_Id;
	//public int City_id; //ilişkisel alan
	public City City= new City(); //bir adreste bir tane şehir var.. o yüzden tekil
}