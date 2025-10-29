package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year <= 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        int days;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
            case 4, 6, 9, 11 -> days = 30;
            case 2 -> {
                boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
                days = isLeap ? 29 : 28;
            }
            default -> {
                System.out.println("invalid date");
                return;
            }
        }

        System.out.println(days);

    }
}
