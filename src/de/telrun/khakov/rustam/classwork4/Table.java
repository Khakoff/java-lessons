package de.telrun.khakov.rustam.classwork4;

/**
 * @author Rustam Khakov
 */
public class Table {
	int seatCount = 0;
	String color = null;
	int width = 0;
	int length = 0;
	int high = 0;

	public Table(int seatCount, int width, int length, int high, String color) {
		this();
		this.high = high;
		this.length = length;
		this.width = width;
		this.color = color;
		this.seatCount = seatCount;
	}

	public Table() {
		System.out.println("Конструктор создался");
	}

	@Override
	public String toString() {
		return "Table{" +
				"seatCount=" + seatCount +
				", color='" + color + '\'' +
				", width=" + width +
				", length=" + length +
				", high=" + high +
				'}';
	}
}
