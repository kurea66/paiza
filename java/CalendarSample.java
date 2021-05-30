import java.util.*;
public class CalendarSample{
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		displayCalendarData(cal);
		System.out.println();

		//１０年後の日付時刻
		cal.add(Calendar.YEAR,10);
		displayCalendarData(cal);
		cal.add(Calendar.YEAR,-10);//もとに戻す
		System.out.println();
		//10ヶ月後日付時刻
		cal.add(Calendar.MONTH, 10);
		displayCalendarData(cal);
		cal.add(Calendar.MONTH, -10);
		System.out.println();

		//１０日後日付時刻
		cal.add(Calendar.DATE, 10);
		displayCalendarData(cal);
		cal.add(Calendar.DATE, -10);
		System.out.println();

		//10時間後の日付時刻
		cal.add(Calendar.HOUR,10);
		displayCalendarData(cal);
		cal.add(Calendar.HOUR, -10);
		System.out.println();

		//10分後の日付時刻
		cal.add(Calendar.MINUTE, 10);
		displayCalendarData(cal);
		cal.add(Calendar.MINUTE, -10);
		System.out.println();

		//10秒後の日付時刻
		cal.add(Calendar.SECOND, 10);
		displayCalendarData(cal);
		cal.add(Calendar.SECOND, -10);
		System.out.println();
	}
	public static void displayCalendarData(Calendar cal){
		System.out.print(cal.get(Calendar.YEAR) + "年");
		System.out.print(cal.get(Calendar.MONTH) + 1 + "月");
		System.out.print(cal.get(Calendar.DAY_OF_MONTH)+ "日");

		int week = cal.get(Calendar.DAY_OF_WEEK);

		String weekString = "";
		switch(week){
			case Calendar.MONDAY:
				weekString = "月曜日";
				break;
			case Calendar.TUESDAY:
				weekString = "火曜日";
				break;
			case Calendar.WEDNESDAY:
				weekString = "水曜日";
				break;
			case Calendar.THURSDAY:
				weekString = "木曜日";
				break;
			case Calendar.FRIDAY:
				weekString = "金曜日";
				break;
			case Calendar.SATURDAY:
				weekString = "土曜日";
				break;
			case Calendar.SUNDAY:
				weekString = "日曜日";
				break;
		}
		System.out.println(weekString);

		if(Calendar.AM == cal.get(Calendar.AM_PM)){
			System.out.print("午前");
		}else{
			System.out.print("午後");
		}
		System.out.print(cal.get(Calendar.HOUR) + "時");
		System.out.print("(" + cal.get(Calendar.HOUR_OF_DAY) + "時)");

		System.out.print(cal.get(Calendar.MINUTE) + "分");
		System.out.print(cal.get(Calendar.SECOND) + "秒");
		System.out.print(cal.get(Calendar.MILLISECOND) + "ミリ秒");
	}
}
