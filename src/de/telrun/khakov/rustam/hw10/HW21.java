package de.telrun.khakov.rustam.hw10;

import java.util.Calendar;

/**
 * @author Rustam Khakov
 */
public class HW21 {
	private static final int MONTH_IN_YEAR = 12;

	public static void main(String[] args) {
		//1) В кассу на пятипроцентный вклад положили 100 рублей. Какой станет сумма вклада через 10 лет?
		//12 процентов = 0.12 к примеру 12% от ста рублей 100 *0.12 = 12
		//
		//1. посчитатйте сумму без капитализации
		//сумма без капитализации - это процент в конце срока + тело депозита
		//к концу третьего года 100 рублей + 36 рублей процентами
		//2. посчитайте сумму с капитализацией в конце каждого года
		//капитализация в конце года - это прибавка процента к сумме в конце года
		//к концу первого года 112 рублей, на второй год считается 12 процентов уже от 112 рублей,  к концу второго года 125.44 рублей
		//к концу третьего года еще 12 процентов от 125.44 будет 140.5
		//3. посчитатйте сумму с капитализацией в конце каждого месяца
		//капитализация в конце месяцы - это прибавка процента к сумме в конце месяца
		//в конце каждого месяца накопленный процент за месяц идет в тело вклада:
		//101 рубль во второй месяц, во второй месяц 12 процентов годовых от 101 рубля, во второй месяц от 102.01 в третий от 103.03
		double percent = 4.7;
		int deposit = 500;
		int periodInYear = 30;

		double depositWithoutCap = deposit;
		double depositWithYearCap = deposit;
		double depositWithMonthCap = deposit;
		for (int i = 0; i < periodInYear; i++) {
			depositWithoutCap += (deposit * (percent / 100));
		}

		for (int i = 0; i < periodInYear; i++) {//
			depositWithYearCap += (depositWithYearCap * (percent / 100));
		}

		for (int year = 0; year < periodInYear; year++) {
			for (int month = 0; month < MONTH_IN_YEAR; month++) {
				depositWithMonthCap += (depositWithMonthCap * (percent /100) / MONTH_IN_YEAR );
			}
		}

		System.out.println(depositWithoutCap);
		System.out.println(depositWithYearCap);
		System.out.println(depositWithMonthCap);

	}
}
