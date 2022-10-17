package pckg2;

public class Services {

    public static boolean isNumberLengthValid (long number, int length) {
        if (String.valueOf(number).length() == length) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isStringValid (String str) {
        if (str.equals(null) || str.trim().equals("")) {
            return false;
        } else {
            return true;
        }
    }
}
