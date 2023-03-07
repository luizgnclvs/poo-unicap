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

    public static long catchInvalidData (long data, int length) {
        data = catchInvalidData(data);

        boolean isFirstLoop = true;

        while (!isNumberLengthValid(data, length)) {
            if (isFirstLoop) {
                System.out.println();
                isFirstLoop = false;
            }

            System.out.println("Tente novamente: ");
            data = read.nextLong();
        }

        System.out.println();

        return data;
    }

    public static int catchInvalidData (int data, int length) {
        data = catchInvalidData(data);

        boolean isFirstLoop = true;

        while (!isNumberLengthValid(data, length)) {
            if (isFirstLoop) {
                System.out.println();
                isFirstLoop = false;
            }

            System.out.println("Tente novamente: ");
            data = read.nextInt();
        }

        System.out.println();

        return data;
    }

    public static int catchInvalidData (int data, int rangeMin, int rangeMax) {
        data = catchInvalidData(data);

        int [] lengths = new int [rangeMax - rangeMin];

        for (int i = 1; i <= lengths.length; i++) {
            lengths[i] = rangeMin;
            rangeMin++;
        }

        boolean isFirstLoop = true;

        while (true) {
            if (isFirstLoop) {
                System.out.println();
                isFirstLoop = false;
            }

            System.out.println("Tente novamente: ");
            data = read.nextInt();

            boolean isValid = false;

            for (int i = 1; i <= lengths.length; i++) {
                isValid = isNumberLengthValid(data, i);

                if (isValid) {
                    break;
                }
            }

            if (isValid) {
                break;
            }
        }

        System.out.println();

        return data;
    }

    public static long catchInvalidData (long data) {
        boolean isFirstLoop = true;

        while (data <= 0) {
            if (isFirstLoop) {
                System.out.println();
                isFirstLoop = false;
            }

            System.out.println("Tente novamente: ");
            data = read.nextLong();
        }

        System.out.println();

        return data;
    }

    public static int catchInvalidData (int data) {
        boolean isFirstLoop = true;

        while (data <= 0) {
            if (isFirstLoop) {
                System.out.println();
                isFirstLoop = false;
            }

            System.out.println("Tente novamente: ");
            data = read.nextInt();
        }

        System.out.println();

        return data;
    }

    public static String catchInvalidData (String data) {
        boolean isFirstLoop = true;

        while (!isStringValid(data)) {
            if (isFirstLoop) {
                System.out.println();
                isFirstLoop = false;
            }

            System.out.println("Tente novamente: ");
            data = read.nextLine();
        }

        System.out.println();

        return data;
    }

    public static String catchInvalidData (String data, String regex) {
        boolean isFirstLoop = true;

        while (!isStringValid(data) && !data.equals(regex)) {
            if (isFirstLoop) {
                System.out.println();
                isFirstLoop = false;
            }

            System.out.println("Tente novamente: ");
            data = read.nextLine();
        }

        System.out.println();

        return data;
    }
}
