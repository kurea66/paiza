import java.util.*;
public class ArrayString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;i++){
			String startTime=sc.next();
			int hour=sc.nextInt();
			int minute=sc.nextInt();

			//:区切りのデータをsplitではなくsubstringで:前と:後で返す。
			int startHour=Integer.parseInt(startTime.substring(0,2));
			int startMinute=Integer.parseInt(startTime.substring(3,5));

			int afterHour=startHour+hour;
			int afterMinute=startMinute+minute;

			if(afterMinute>59){
				afterMinute-=60;
				afterHour++;
			}
			if(afterHour>23){
				afterHour-=24;
			}
			System.out.printf("%02d:%02d%n",afterHour,afterMinute);
		}
	}
}
