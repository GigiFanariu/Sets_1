import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> daysOfTheWeek = new HashSet<>();

        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Thursday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");
        daysOfTheWeek.add("Sunday");

        System.out.println("Week Days: " + daysOfTheWeek);

        Set<String> linkedDaysOfTheWeek = new LinkedHashSet<>();

        linkedDaysOfTheWeek.add("Monday");
        linkedDaysOfTheWeek.add("Tuesday");
        linkedDaysOfTheWeek.add("Wednesday");
        linkedDaysOfTheWeek.add("Thursday");
        linkedDaysOfTheWeek.add("Friday");
        linkedDaysOfTheWeek.add("Saturday");
        linkedDaysOfTheWeek.add("Sunday");

        System.out.println("Linked Week Days: " + linkedDaysOfTheWeek);
        boolean setequal = daysOfTheWeek.equals(linkedDaysOfTheWeek);

        System.out.println("Is the first Set equal to the second one?" + setequal);

    }
}
