package exercise.unit_5;

public class Exercise7 {

    public static void main(String[] args) {
        Date testDate1 = new Date(2023, 12, 25, "Monday");
        Date testDate2 = new Date(2023, 12, 31, "Sunday");

        System.out.println(testDate1.equals(testDate2));
        System.out.println(testDate1.compareTo(testDate2) > 0 ? "First is later"
                : testDate1.compareTo(testDate2) == 0 ? "Those Two Date are same" : "Second is later");
        System.out.println(testDate2.isLeafYear());

        Date testDate3 = testDate2.getNextDate();
        System.out.println(testDate3);
        System.out.println(testDate3.isLeafYear());
    }

    private Exercise7() {

    }

}

class Date implements Comparable<Date> {
    private int year;
    private int month;
    private int day;
    private String dayOfTheWeek;

    private int[] daysOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public Date(int year, int month, int day, String dayOfTheWeek) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public boolean isLeafYear() {
        return getYear() % 4 == 0 || (getYear() % 100 != 0 && getYear() % 400 == 0);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public Date getNextDate() {
        int nextYear = getYear();
        int nextMonth = getMonth();
        int nextDay = getDay();

        daysOfMonth[1] = isLeafYear() ? 29 : 28;

        if (getDay() == daysOfMonth[getMonth() - 1]) {
            if (getMonth() == 12 && getDay() == daysOfMonth[11]) {
                nextYear += 1;
                nextMonth = 0;
            }
            nextMonth += 1;
            nextDay = 0;
        }
        nextDay += 1;

        return new Date(nextYear, nextMonth, nextDay, getNextDayOfTheWeek());
    }

    public String getNextDayOfTheWeek() {
        String nextDayOfTheWeek = "";

        switch (getDayOfTheWeek()) {
            case "Sunday":
                nextDayOfTheWeek = "Monday";
                break;
            case "Monday":
                nextDayOfTheWeek = "Tuesday";
                break;
            case "Tuesday":
                nextDayOfTheWeek = "Wednsday";
                break;
            case "Wednsday":
                nextDayOfTheWeek = "Thursday";
                break;
            case "Thursday":
                nextDayOfTheWeek = "Friday";
                break;
            case "Friday":
                nextDayOfTheWeek = "Saturday";
                break;
            case "Saturday":
                nextDayOfTheWeek = "Sunday";
                break;
            default:
                break;
        }
        return nextDayOfTheWeek;
    }

    @Override
    public String toString() {
        return getYear() + ". " + getMonth() + ". " + getDay() + ". " + getDayOfTheWeek();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + year;
        result = prime * result + month;
        result = prime * result + day;
        result = prime * result + ((dayOfTheWeek == null) ? 0 : dayOfTheWeek.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Date other = (Date) obj;
        if (year != other.year || month != other.month || day != other.day) {
            return false;
        }

        if (dayOfTheWeek == null) {
            if (other.dayOfTheWeek != null) {
                return false;
            }
        } else if (!dayOfTheWeek.equals(other.dayOfTheWeek)) {
            return false;
        }

        return true;
    }

    @Override
    public int compareTo(Date other) {
        if (this.year == other.year) {
            if (this.month == other.month) {
                return this.day - other.day;
            } else {
                return this.month - other.month;
            }
        } else {
            return this.year - other.year;
        }
    }

}