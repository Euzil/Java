

import java.util.EnumSet;

public class EnumSetTest {
    public static void main(String[] args) {
        EnumSet<Weeks> week = EnumSet.noneOf(Weeks.class);
        week.add(Weeks.MONDAY);
        System.out.println("EnumSet中的元素：" + week);
        week.remove(Weeks.MONDAY);
        System.out.println("EnumSet中的元素：" + week);
        week.addAll(EnumSet.complementOf(week));
        System.out.println("EnumSet中的元素：" + week);
        week.removeAll(EnumSet.range(Weeks.MONDAY, Weeks.THURSDAY));
        System.out.println("EnumSet中的元素：" + week);
    }
}
