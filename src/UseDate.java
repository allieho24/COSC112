
public class UseDate {

	public static void main(String[] args) {

		// Part: B
		CS112DateObject day1 = new CS112DateObject("April", 3, 2002);

		// Part: C
		CS112DateObject day2 = new CS112DateObject("April", 12,2002);

		// Part: B
		System.out.println(day1);                    	//prints out the current inputted date
		System.out.println(day1.leapYear());        	//true or false if it's a leap year
		System.out.println(day1.isLeapYear());       	//prints out whether or not it's a leap year
		System.out.println(day1.daysInMonth());       	//number of days in the month
		System.out.println(day1.sDaysInMonth());    	//prints string of the number of days in a month
		day1.makeTomorrow();
		System.out.println(day1);

		// Part: C
		day1.makeTomorrow(8);
		System.out.println(day1);
		System.out.println(day1.generateCopy());
		System.out.println(day1.sameDate(day2));
		System.out.println(day1.generateTomorrow());

		// Part: D

	}
}