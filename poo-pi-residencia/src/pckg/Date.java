package pckg;

public class Date {
    private int day, month, year;
    private Time time;

    public Date () {}

    public Date (int day, int month, int year, Time time) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.time = time;
    }

    public int getDay () {
        return this.day;
    }

    public void setDay (int day) {
        this.day = day;
    }

    public int getMonth () {
        return this.month;
    }

    public void setMonth (int month) {
        this.month = month;
    }

    public int getYear () {
        return this.year;
    }

    public void setYear (int year) {
        this.year = year;
    }

    public Time getTime () {
        return this.time;
    }

    public void setTime (Time time) {
        this.time = time;
    }
}
