import java.util.EnumMap;

public class EnumMapTest {
    public static void main(String[] args) {
        EnumMap<Weeks, String> weeks = new EnumMap<Weeks, String>(Weeks.class);
        weeks.put(Weeks.MONDAY, "����һ");
        weeks.put(Weeks.SUNDAY, "������");
        System.out.println("EnumMap�еļ�ֵ�Ը�����" + weeks.size());
        System.out.println("EnumMap�еļ�ֵ�ԣ�" + weeks);
        System.out.println("EnumMap���Ƿ������SATURADAY��"
                + weeks.containsKey(Weeks.SATURADAY));
        System.out.println("EnumMap���Ƿ����ֵ�����գ�" + weeks.containsValue("������"));
        weeks.remove(Weeks.MONDAY);
        System.out.println("EnumMap�еļ�ֵ�ԣ�" + weeks);
        System.out.println("EnumMap�м�MONDAY��Ӧ��ֵ��" + weeks.get(Weeks.MONDAY));
    }
}
