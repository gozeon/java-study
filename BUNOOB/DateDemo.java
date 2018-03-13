import java.util.*;
import java.text.*;

public class DateDemo {
	public static void testTime() {
		try {
			long start = System.currentTimeMillis();
			System.out.println(new Date() + "\n");
			Thread.sleep(5 * 60 * 10);
			System.out.println(new Date() + "\n");

			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println("Diff is : " + diff);
		} catch (Exception e) {
			System.out.println("Got an exception");
		}
	}

	public static void formatTime() {
		Date date = new Date();

		System.out.printf("全部日期和时间信息: %tc%n", date);
		System.out.printf("年-月-日格式: %tF%n", date);
		System.out.printf("月/日/年格式: %tD%n", date);
		System.out.printf("HH:MM:SS PM格式(12): %tr%n", date);
		System.out.printf("HH:MM:SS 格式(24): %tT%n", date);
		System.out.printf("HH:MM 格式(24): %tR", date);
		System.out.println();
		System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
	}

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());

		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		System.out.println("Current Date:" + ft.format(dNow));
		formatTime();
		System.out.println();
		testTime();
		System.out.println();
	}
}
