package de.telrun.khakov.rustam.classwork7;

/**
 * @author Rustam Khakov
 */
public class CW2 {
	// break  return
	public void testVal(String val) {
		if (val.length() == 0) {
			return;
		}

		if (val.contains("туча")) {
			System.out.println("нашли тучу");
		}
	}
}
