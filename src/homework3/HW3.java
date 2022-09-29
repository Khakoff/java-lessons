package homework3;

/**
 * @author Rustam Khakov
 */
public class HW3 {
	public static void main(String[] args) {
		String studyStr = "I study Basic Lessons  Java!";
		System.out.println(studyStr);
		System.out.println(studyStr.charAt(studyStr.length() - 1));
		System.out.println(studyStr.contains("Java"));
		System.out.println(studyStr.replace('a', 'o'));
		System.out.println(studyStr.toLowerCase());
		System.out.println(studyStr.toUpperCase());
		String javaStr = "Java";
		System.out.println(studyStr.substring(studyStr.indexOf(javaStr), studyStr.indexOf(javaStr) + javaStr.length()));

		double percent = (200 / 470.0) * 100;
		System.out.println(percent);

		char asciiSymbol = 'g';
		int asciiIndex = asciiSymbol;
		System.out.println(asciiIndex);

		double number = 59.976;
		int numberInt = (int) Math.floor(number);
		System.out.println(numberInt);

		int i = 475;
		short s = (short) i;

	}
}
