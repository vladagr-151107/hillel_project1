package hw15;

public enum Day {
    MONDAY,
    TUESDAY, WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

interface Advisor {
    void advise(Day day);
}

class WeekdayAdvisor implements Advisor {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("Today is Monday, so drink some coffee and prepare for the tough week.");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday, so pay attention to details and don't be nervous.");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday, do some stretching after work. Your back will thank you!");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday, so once you come home, treat yourself to something tasty..");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Today I advise you to go somewhere with your friends and have fun.");
                break;
        }
    }
}