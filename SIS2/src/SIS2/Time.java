package SIS2;

public class Time {
	private int hour;
	private int minute;
	private int second;
	private boolean AM;
	Time(int newh, int newm, int news) {
		if(newh <= 23 && newh>=0) {
			hour = newh;
		}
		if(newm <= 59 && newm >=0) {
			minute = newm;
		}
		if(news <= 59 && news >=0) {
			second = news;
		}
	}
	public static Time add(Time t1, Time t2) {
		int temphour = (t1.hour + t2.hour)%24;
		int tempminute = (t1.minute + t2.minute);
		int tempsecond = (t1.second + t2.second);
		if(tempminute > 59) {
			temphour = (temphour+1)%24;
			tempminute = tempminute%60;
		}
		if(tempsecond>59) {
			tempsecond = tempsecond%60;
			tempminute++;
			if(tempminute > 59) {
				temphour = (temphour+1)%24;
				tempminute = tempminute%60;
			}
		}
		Time temp = new Time(temphour,tempminute,tempsecond);
		return temp;
	}
	public void setTime(int newh, int newm, int news) {
		if(newh <= 23 && newh>=0) {
			hour = newh;
		}
		else {
			System.out.println("Wrong hour format");
		}
		if(newm <= 59 && newm >=0) {
			minute = newm;
		}
		else {
			System.out.println("Wrong minute format");
		}
		if(news <= 59 && news >=0) {
			second = news;
		}
		else {
			System.out.println("Wrong second format");
		}
	}
	public String toStandard() {
		String ret = "";
		String sec=second+"";
		String min=minute+"";
		String ho = hour+"";
		if(second<10) {
			sec = "0"+second;
		}
		if(minute<10) {
			min = "0"+minute;
		}
		if(hour >= 12) {
			AM = false;
		}
		else {
			AM = true;
		}
		if(AM){
			if(hour<10) {
				ho = "0" + hour;
			}
			ret = ho + ":"+ min + ":"+sec+"AM";
		}
		else {
			if(hour-12<10) {
				ho = "0" + (hour-12);
			}
			ret = ho + ":"+min+":"+sec+" PM";
		}
		return ret;
	}
	
	public String toUniversal() {
		String sec=second+"";
		String min=minute+"";
		String ho = hour+"";
		if(second<10) {
			sec = "0"+second;
		}
		if(minute<10) {
			min = "0"+minute;
		}
		if(hour<10) {
			ho = "0"+hour;
		}
		return ho+":"+min+":"+sec;
	}
}
