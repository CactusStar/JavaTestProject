import java.util.*;

public class ArrayCompare {

    public static void main(String[] args) {
        String[] test1 = {"aaa", "bbb"};
        String[] test2 = {"aa", "bbb"};
        var test3 = Arrays.equals(test1, test2);
        System.out.println(test3);
    }
}
