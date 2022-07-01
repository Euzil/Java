import java.util.Arrays;

public class SortTest {

    void sort(int... number) {
        Arrays.sort(number);
        for (int i : number) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void sort(char... number) {
        Arrays.sort(number);
        for (char c : number) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    void sort(String... numberStr) {
        int number[] = new int[numberStr.length];
        for (int i = 0, length = numberStr.length; i < length; i++) {
            number[i] = Integer.parseInt(numberStr[i]);
        }
        sort(number);
    }

    public static void main(String[] args) {
        SortTest d = new SortTest();
        int arr1[] = {6, 9, 1, 3, 7, 2};
        char arr2[] = {'6', '9', '1', '3', '7', '2'};
        String arr3[] = {"6", "9", "1", "3", "7", "2"};
        d.sort(arr1);
        d.sort(arr2);
        d.sort(arr3);
    }

}
