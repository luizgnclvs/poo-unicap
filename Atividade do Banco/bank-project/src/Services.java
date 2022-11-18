import java.util.Scanner;

public class Services {
    private static Scanner read = new Scanner(System.in);

    public static boolean isNumberLengthValid (int number, int length) {
        if (String.valueOf(number).length() == length) {
            return true;
        } else {
            return false;
        }
    }

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

    public static int validOption (int minOption, int maxOption) {
        boolean first = true;
        int option = read.nextInt();

        while (option < minOption || option > maxOption) {
            if (first) {
                System.out.println();
                first = false;
            }

            System.out.print("Opção inválida! Tente novamente: ");
            option = read.nextInt();
            read.nextLine();
        }

        System.out.println();

        return option;
    }
}
