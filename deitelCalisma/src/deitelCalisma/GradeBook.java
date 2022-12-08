package deitelCalisma;

public class GradeBook {
private String courseName;
private int[] grades; //Öğrenci Notlarını Sınıf Not Defterinde Bir Dizide Saklama


// constructor



public String getCourseName() {
	return courseName;
}


public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public GradeBook(String courseName, int[] grades)
{
	this.setCourseName(courseName);
	this.grades = grades;
}
public void processGrades()
{
	outputGrades(); //çıktı notları dizisi


//ortalama notu hesaplamak için getAverage yöntemini çağırın
System.out.printf("%nClass average is %.2f%n", getAverage() );
System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",
		getMinimum() ,getMaximum() );

outputBarChart();
}


}
