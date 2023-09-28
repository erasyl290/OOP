package problem3;

public class Time {
	public int hour, min, sec;

	Time() {
	}

	Time(int hour, int min, int sec) {
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
		hour += time.hour;
		min += time.min;
		sec += time.sec;
		convertToHours();
	}

	public String setTime() {
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
		if (hour > 23)
			hour -= hour / 24 * 24;
		return setTime();
	}

	public String toStandard() {
		if (hour > 12)
			hour -= 12;
		if (hour > 24) {
			hour -= hour / 24 * 24;
			return setTime() + " PM";
		}
		return setTime() + " AM";
	}

	public String toString() {
		return setTime();
	}
}
