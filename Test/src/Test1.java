import java.lang.IllegalArgumentException;
public class Test1 {
 private int hour;
 private int minute;
 private int second;

 
 
 
 public Test1(int hour,int minute,int second)
 {
	 if(hour>50)
	 {
		 throw new IllegalArgumentException("hata bulundu");
		 
	 }
	 this.hour = hour;
	 this.minute = minute;
	 this.second= second;
	 
 }

 
 
 
 public int getHour() {
	return hour;
}

public void setHour(int hour) {
	this.hour = hour;
}
public int getMinute() {
	return minute;
}
public void setMinute(int minute) {
	this.minute = minute;
}
public int getSecond() {
	return second;
}
public void setSecond(int second) {
	this.second = second;
}
 
}
