package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year;

	public static void main(String[] args) {
		LinkedList<Date> list = new LinkedList<Date>();

	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public Date(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}

	public String toString() {
		return this.month + "/" + this.day + "/" + this.year;
	}
}
