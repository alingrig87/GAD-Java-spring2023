enum WeekDays {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    final int x;
    WeekDays() {
        x = 10;
    }
}


public class Enums {

    public static void main(String[] args) {
        WeekDays wd = WeekDays.SUNDAY;

//        switch (wd) {
//            case MONDAY:
//                System.out.println("Merg la sala");
//                break;
//            case TUESDAY:
//                System.out.println("Merg la curs");
//            default:
//                System.out.println("Stau");
//
//        }

        for (WeekDays weekDay: WeekDays.values()) {
            System.out.println(weekDay);
        }

        System.out.println(WeekDays.valueOf("MONDAY"));
        System.out.println(WeekDays.FRIDAY.name());

    }
}
