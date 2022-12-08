package inheritance;

public class Manager extends Employee{
    private int num_of_employee;
	public Manager(String name, String department, int salary,int num_of_employee) {
		super(name,department,salary);
		this.num_of_employee = num_of_employee;
		
	}
	public void raiseSalary(int amount)
	{
		System.out.println("çalışanlara" + amount +"tl zam yapıldı.");
	}
	

}
