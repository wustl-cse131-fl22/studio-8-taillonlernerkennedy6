package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean hourFormat;

	public static void main(String[] args) {
		Time time1 = new Time(11, 53, true);
		Time time2 = new Time(23, 14, true);
		Time time3 = new Time(7, 32, false);
		Time time4 = new Time(16, 28, false);
    }
	
	@Override
	public int hashCode() {
		return Objects.hash(hour, hourFormat, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && hourFormat == other.hourFormat && minute == other.minute;
	}

	public Time(int h, int m, boolean hF) {
		this.hour = h;
		this.minute = m;
		this.hourFormat = hF;
		if(hF == true) {
			//12-hour time
			this.hourFormat = true;
		}
	}
	
	public String toString() {
		if(this.hourFormat == true) {
			return this.hour + ":" + this.minute;
		}
		else {
			return hour - 12 + ":" + minute;
		}
	}
}