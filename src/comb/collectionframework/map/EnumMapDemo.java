package comb.collectionframework.map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        Map<Day, String> map = new EnumMap<Day, String>(Day.class);
        map.put(Day.TUESDAY, "Gym");
        map.put(Day.MONDAY, "Walk");
        map.put(Day.SUNDAY, "Rest");
        System.out.println(map);
        System.out.println(Day.SUNDAY.ordinal());
        System.out.println(map.get(Day.TUESDAY));

    }
}
enum Day{
    MONDAY, TUESDAY,  WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
