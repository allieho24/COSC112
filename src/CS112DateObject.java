public class CS112DateObject {
    // Name: Allie Ho
    // Class: COSC112
    // Lab 2

    // Part B

    private int intDay;
    private int year;
    private int intMonth; //January = 1

    // Array of all the months
    private String[] months = {"January", "February", "March", "April",
            "May", "June", "July", "August", "September",
            "October", "November", "December"};

    // Array of all the days in a month in order (except for February's leap year)
    private int[] daysPerMonth = {31, 28, 31, 30,
            31, 30, 31, 31,
            30, 31, 30, 31};

    //constructor ---- makes the setDate constructor
    public CS112DateObject(String m, int d, int y) {
        setDate(m, d, y);
    }

    //defines m as month as the (index number + 1)
    public void setMonth(String m) {
        for (int i = 0; i < 12; i++) {
            if (m == months[i]) {
                intMonth = i + 1;
            }
        }
    }

    //defines d as day
    public void setDay(int d) {
        intDay = d;
    }

    //defines year as y
    public void setYear(int y) {
        year = y;
    }

    //defines sMonths, intDay, and year
    public void setDate(String sMonth, int intDay, int year) {
        setMonth(sMonth);
        setDay(intDay);
        setYear(year);
    }

    // makes a string sentence to output the current date instead of the hash number
    public String toString() {
        String date = "The date is " + months[intMonth - 1] + ", " + intDay + ", " + year + ".";
        return date;
    }

    //outputs how many days there are in a month from daysPerMonth[]
    public int daysInMonth() {
        if ((leapYear() == true) && intMonth == 2) {
            return 29;
        }
        return daysPerMonth[intMonth - 1];
    }

    //outputs String of how many days there are in m month
    public String sDaysInMonth() {
        if ((leapYear() == true) && intMonth == 2) {
            return "There are 29 days in February in a leap year.";
        } else {
            return "There are " + daysPerMonth[intMonth - 1] + " days in " + months[intMonth - 1] + ".";
        }
    }

    //defines an leapYear and sees if it is
    public boolean leapYear() {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        } else
            return false;
    }

    //says in a string sentence whether or not it is a leap year
    public String isLeapYear() {
        String yesLeapYear = "The year " + year + " is a leap year.";
        String notLeapYear = "The year " + year + " is not a leap year.";
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return yesLeapYear;
        } else
            return notLeapYear;
    }

    //outputs the date of tomorrow. includes leap years and end of months, end of years.
    public void makeTomorrow() {
        //if it is a leap year and it's February:
        if ((leapYear() == true) && intMonth == 2) {
            if (intDay <= 28) {                         //if it's not the 28th of February
                setDay(intDay + 1);                     //add one day
                setMonth("February");                   //the month is still the month it was
            } else {                                    //if it's not the 28th, as in 29th
                setDay(1);                              //the next day is the first
                setMonth("March");                      //of March
            }
        } else {                                        //if it's not a leap year
            if (intDay < daysInMonth()) {               //if it's not the end of the month
                setDay(intDay + 1);                     //add a day
            }
            if (intDay == daysInMonth()) {              //if it is the end of the month
                setDay(1);                              //next day is the first
                if (intMonth < 12) {                    //if it's not December
                    setMonth(months[intMonth + 1]);     //make it the next month
                } else {                                //if it is December
                    setMonth("January");                //the next month is January
                    setYear(year + 1);                  //add a year
                }
            }
        }
    }


    // Part: C

    public void makeTomorrow(int n) {
        for (int i = 0; i < n; i++) {
            makeTomorrow();
        }
    }

    public CS112DateObject generateCopy() {
        CS112DateObject dateObject = new CS112DateObject(months[intMonth - 1], intDay, year);
        return dateObject;
    }

    public boolean sameDate(CS112DateObject inputDate) {
        if ((this.intDay == inputDate.intDay) && (this.year == inputDate.year) && (this.intMonth == inputDate.intMonth)) {
            return true;
        } else
            return false;
    }

    public CS112DateObject generateTomorrow() {
        CS112DateObject dateObject = new CS112DateObject(months[intMonth - 1], intDay + 1, year);
        return dateObject;
    }
    //use generateTomorrow() to makeTomorrow()
}

    // Part: D








    // change makeTomorrow and leapYear and constructor cuz there's new parameters
    //location have a different if else every different location

