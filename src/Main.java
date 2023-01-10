public class Main {
    public static void main(String[] args) {
        // Checks if -1600 is a leap year.
        System.out.println(isLeapYear(-1600));

        // Checks if 1600 is a leap year.
        System.out.println(isLeapYear(1600));

        // Checks if 2017 is a leap year.
        System.out.println(isLeapYear(2017));

        // Checks if 2000 is a leap year.
        System.out.println(isLeapYear(2000));

        // Finds how many days are in a month of January in the year 2020.
        System.out.println(getDaysInMonth(1, 2020));

        // Finds how many days are in a month of February in the year 2020.
        System.out.println(getDaysInMonth(2, 2020));

        // Finds how many days are in a month of February in the year 2018.
        System.out.println(getDaysInMonth(2, 2018));

        // Finds how many days are in a month of -1 in the year 2020.
        System.out.println(getDaysInMonth(-1, 2020));

        // Finds how many days are in a month of January in the year -2020.
        System.out.println(getDaysInMonth(1, -2020));
    }

    /**
     * Checks if a year is a leap year.
     *
     * @param year Year should be between 1 and 9999.
     * @return true, if the year is a leap year, otherwise false.
     */
    public static boolean isLeapYear(int year) {
        // Checks for invalid input.
        if (year < 1 || year > 9999) {
            return false;
        }

        // Checks if the year is a leap year.
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }

    /**
     * Finds days in a month.
     */
    public static int getDaysInMonth(int month, int year) {
        // Checks for invalid value.
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            return -1;
        }

        // Returns days in a month.
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> -1;
        };
    }
}