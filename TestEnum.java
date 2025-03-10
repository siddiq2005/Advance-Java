 enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
    SATURDAY;
}

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

enum Color {
    RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");
    private String code;
    Color(String code) { this.code = code; }
    public String getCode() { return code; }
}

public class TestEnum {

    public static void main(String[] args) {
        Day today = Day.THURSDAY;
        System.out.println("Today is: " + today);

        Level level = Level.MEDIUM;
        switch(level) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

        for (Day day : Day.values()) {
            System.out.println(day);
        }

        Color color = Color.RED;
        System.out.println(color.getCode());
    }
}