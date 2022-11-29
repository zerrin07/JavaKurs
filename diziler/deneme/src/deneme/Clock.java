package deneme;

public class Clock {
private int hour;
private int minute;
private int second;

public Clock(int hour,int minute,int second)
{
	if(hour>29 && minute>59 && second>59)
	{
	this.hour =0;
	this.minute=0;
	this.second=0;
	}
	else {
		this.hour = hour;
		this.minute = minute;
		this.second=second;
	}
}
public void displayTime()
{
	System.out.printf("%d:%d:%d",this.hour,this.minute,this.second);
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
