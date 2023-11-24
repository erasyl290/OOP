package problem5;

public class Time implements Comparable<Time> {
	public int hour, min, sec;

	public Time() {
	}

	public Time(int hour, int min, int sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
		convertToHours();
	}

	public void convertToHours() {
		if (sec >= 60) {
			min += sec / 60;
			sec -= sec / 60 * 60;
		}
		if (min >= 60) {
			hour += min / 60;
			min -= min / 60 * 60;
		}
	}

	public void add(Time time) {
		int formatHour = time.hour;
		if (formatHour > 23)
			formatHour -= formatHour / 24 * 24;
		hour += formatHour;
		min += time.min;
		sec += time.sec;
		convertToHours();
	}

	public String setTime(int hour) {
		String time = "";
		if (hour < 10)
			time += '0';
		time += hour + ":";

		if (min < 10)
			time += '0';
		time += min + ":";

		if (sec < 10)
			time += '0';
		time += sec;
		return time;
	}

	public String toUniversal() {
		int formatHour = hour;

		if (formatHour > 23)
			formatHour -= formatHour / 24 * 24;

		return setTime(formatHour);
	}

	public String toStandard() {
		String end = " AM";
		int formatHour = hour;

		if (formatHour > 23) {
			formatHour -= formatHour / 24 * 24;
			if (formatHour == 0) {
				formatHour = 12;
				end = " PM";
			}
		}

		if (formatHour > 12) {
			formatHour -= 12;
			end = " PM";
		}

		return setTime(formatHour) + end;
	}

	public String toString() {
		return setTime(hour);
	}
	
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (this.getClass() != obj.getClass()) return false;
		Time oth = (Time) obj;
		return this.hour == oth.hour &&
				this.min == oth.min &&
				this.sec == oth.sec;
	}

	public int compareTo(Time time) {
		if (hour > time.hour)
			return 1;
		if (hour < time.hour)
			return -1;
		if (min > time.min)
			return 1;
		if (min < time.min)
			return -1;
		if (sec > time.sec)
			return 1;
		if (sec < time.sec)
			return -1;
		return 0;
	}
}
