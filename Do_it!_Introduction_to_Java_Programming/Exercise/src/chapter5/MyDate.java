package chapter5;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isValid() {
        boolean isValid;

        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if(day < 1 || day > 31) {
                    isValid = false;
                }
                else {
                    isValid = true;
                }
                break;
            case 4: case 6: case 9: case 11:
                if(day < 1 || day > 30) {
                    isValid = false;
                }
                else {
                    isValid = true;
                }
                break;
            case 2:
                if(day < 1 || day > 28) {
                    isValid = false;
                }
                else {
                    isValid = true;
                }
                break;
            default:
                isValid = false;
        }
        return isValid;
    }

    public MyDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }
}
