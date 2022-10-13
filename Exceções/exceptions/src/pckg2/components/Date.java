package pckg2.components;

import pckg2.exceptions.InvalidDataException;
import pckg2.exceptions.NegativeOrNullNumberException;

public class Date {
    private short year;
    private short month;
    private short day;

    public Date () {}

    public Date (short year, short month, short day) throws InvalidDataException {
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
    }

    public short getYear () {
        return this.year;
    }

    public void setYear (short year) throws InvalidDataException {
        if (year < 1) {
            throw new InvalidDataException("O valor inserido não é um ano válido.");
        } else {
            this.year = year;
        }
    }

    public short getMonth () {
        return this.month;
    }

    public void setMonth (short month) throws InvalidDataException {
        if (month <= 0) {
            throw new NegativeOrNullNumberException();
        } else {
            if (month < 1 || month > 12) {
                throw new InvalidDataException("O valor inserido não é um mês válido.");
            } else {
                this.month = month;
            }
        }
    }

    public short getDay () {
        return this.day;
    }

    public void setDay (short day) throws InvalidDataException {
        if (day <= 0) {
            throw new NegativeOrNullNumberException();
        } else {
            if (day < 1 || day > 31) {
                throw new InvalidDataException("O valor inserido não é um dia válido.");
            } else {
                this.day = day;
            }
        }
    }
}
