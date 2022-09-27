package classwork3;

/**
 * @author Rustam Khakov
 */
public class CW3 {
	public static void main(String[] args) {
		byte firstVal = 127;
		short secondValue = firstVal; // 127
		int thirdVal = secondValue; //127
		int downgradeVal = 1245; // -128 -- 127
		byte downgradedVal = (byte) downgradeVal;
		System.out.println(downgradedVal);
//		______________________

		char c = 'z';
		int i = Character.getNumericValue(c);
		System.out.println(i);
		int z = c;
		System.out.println(z);
		// 16 : 10 a 11 b 12 c 13 d ... z - 35

		//Example 3
		double divide = 3 / 4.0;// 3/4 -> 0 (3)
		double percent = (100.0 / 1500) * 100;
		System.out.println(percent);
		int param1 = 10;
		param1++; // 11
		param1++; //12
		param1--;// 11

		//Example 4
		byte byteVal = 127;
		byteVal++;
		System.out.println(byteVal);
		byteVal = (byte) (byteVal + 1);

		double bigVal = 123.444;
		int roundedRes = (int) Math.round(bigVal);
		System.out.println(roundedRes);

		String val = "123";
		String val2 = "444";
		int intVal = Integer.parseInt(val);
		int intVAl2 = Integer.parseInt(val2);
		System.out.println(intVal + intVAl2);

		String helloWorldStr = "    Hello World   "; // 'H' 'e' 'l' 'l' ' ' ...
		System.out.println(helloWorldStr);
		System.out.println(helloWorldStr.charAt(0));
		System.out.println(helloWorldStr.toLowerCase());
		System.out.println(helloWorldStr.toUpperCase());
		System.out.println(helloWorldStr.indexOf('l'));
		System.out.println(helloWorldStr.lastIndexOf('l'));
		System.out.println(helloWorldStr.indexOf('s'));
		System.out.println(helloWorldStr.indexOf("llo"));
		System.out.println("Длина равна " + helloWorldStr.length());
		String trimmedStr = helloWorldStr.trim(); // enter, tab , space из конца и начала строки
		System.out.println(trimmedStr.length());
		System.out.println(trimmedStr);
		System.out.println(trimmedStr.repeat(3));
		System.out.println(trimmedStr.replace('l', 'p'));
		System.out.println(trimmedStr.replace("llo", "y"));
		System.out.println(trimmedStr.replace("l", "yu"));
		System.out.println(trimmedStr.substring(6));
		System.out.println(trimmedStr.substring(0, 5));

		char upToCut = 'W';
		int indexOfCutSymbol = trimmedStr.indexOf(upToCut);
		System.out.println(trimmedStr.substring(0, indexOfCutSymbol+1));

		System.out.println(trimmedStr.startsWith("Hello"));
		System.out.println(trimmedStr.endsWith("rld"));

	}
}
