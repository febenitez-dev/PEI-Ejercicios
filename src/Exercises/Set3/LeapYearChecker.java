package Exercises.Set3;

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        if (year <= 0) {
            return false;
        }

        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else {
            return year % 400 == 0;
        }
    }

}
