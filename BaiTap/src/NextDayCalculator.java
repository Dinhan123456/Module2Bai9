public class NextDayCalculator {
    public static String findNextDay(int day, int month, int year){
        int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)){
            daysOfMonth[1] = 29;
        }
        day++;
        if (day > daysOfMonth[month - 1]){
            day = 1;
            month++;
            if (month > 12){
                month = 1;
                year++;
            }
        }
        return day + "/" + month + "/" + year;
    }
    public static boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
