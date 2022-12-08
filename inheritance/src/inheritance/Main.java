package inheritance;

public class Main {
 public static void main(String[]args)
 {
	 Employee employee= new Employee("mustafa","mali",2000);
	 employee.showInfos();
	 Manager manager = new Manager("ali","ascı",5000,10);
	 manager.showInfos();
	 manager.raiseSalary(100);
 }
}
