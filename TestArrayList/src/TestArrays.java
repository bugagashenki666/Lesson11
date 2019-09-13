import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestArrays {
    public static void main(String[] args) {

            List<Integer> list = TestArrayList.fillList();
            System.out.println("MAX=" + TestArrayList.Max(list));
            System.out.println("MIN=" + TestArrayList.Min(list));
            TestArrayList.printMap(TestArrayList.Counts(list), "Число: ", "Встречается: ");
            Map<Integer, Integer> map = TestArrayList.fillMap();
            TestArrayList.printMap(map, "День", "Температура");

    }
}
