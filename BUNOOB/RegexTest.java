
import java.util.regex.*;

public class RegexTest {

	public static void group() {
		String line = "This order was placed for QT3000! OK?";
		String pattern = "(\\D*)(\\d+)(.*)";

		Pattern r = Pattern.compile(pattern);

		Matcher m = r.matcher(line);

		if (m.find()) {
			System.out.println("group0: " + m.group(0));
			System.out.println("group1: " + m.group(1));
			System.out.println("group2: " + m.group(2));
			System.out.println("group3: " + m.group(3));
		}
	}

	public static void startAndEnd() {
		final String REGEX = "\\bcat\\b";
		final String INPUT = "cat cat cat cattie cat";

		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT);
		int count = 0;

		while (m.find()) {
			count++;
			System.out.println("Match number " + count);
			System.out.println("star(): " + m.start());
			System.out.println("end(): " + m.end());
		}
	}

	public static void main(String[] args) {
		String content = "I am noob " + "from runoob.com.";
		String pattern = ".*runoob.*";
		boolean isMatch = Pattern.matches(pattern, content);
		System.out.println("字符串中是否包含了'runoob'子字符串? " + isMatch);

		System.out.println();
		group();
		System.out.println();
		startAndEnd();
	}
}
