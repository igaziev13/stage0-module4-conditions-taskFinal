package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        String inv = "invalid date";
        if (year>=0) {
            //Defining whether year is leap or not
            boolean leap = false;
            if (year % 4 == 0)
                if (year % 100 == 0)
                    leap = year % 400 == 0;
                else leap = true;
            //Checking how many days in the month
            int leapDay = leap ? 1 : 0;
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
                case 4, 6, 9, 11 -> System.out.println(30);
                case 2 -> System.out.println(28 + leapDay);
                default -> System.out.println(inv);
            }
        }
        else
            System.out.println(inv);
    }
}
