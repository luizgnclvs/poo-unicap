package pckg2.components;

import pckg2.exceptions.InvalidDataException;
import pckg2.exceptions.NegativeOrNullNumberException;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date () {}

    public Date (int year, int month, int day) throws InvalidDataException {
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
    }

    public int getYear () {
        return this.year;
    }

    public void setYear (int year) throws InvalidDataException {
        if (year < 1) {
            throw new InvalidDataException("O valor inserido não é um ano válido.");
        } else {
            this.year = year;
        }
    }

    public int getMonth () {
        return this.month;
    }

    public void setMonth (int month) throws InvalidDataException {
        if (month < 1) {
            throw new NegativeOrNullNumberException();
        } else {
            if (month > 12) {
                throw new InvalidDataException("O valor inserido não é um mês válido.");
            } else {
                this.month = month;
            }
        }
    }

    public int getDay () {
        return this.day;
    }

    public void setDay (int day) throws InvalidDataException {
        if (day < 1) {
            throw new NegativeOrNullNumberException();
        } else {
            if (day > 31) {
                throw new InvalidDataException("O valor inserido não é um dia válido.");
            } else {
                this.day = day;
            }
        }
    }

    public String toString () {
        return this.day + "/" + this.month + "/" + this.year;
    }
}
