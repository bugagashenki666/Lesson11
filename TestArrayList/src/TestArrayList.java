import java.util.*;

public class TestArrayList {
    static int Max(List<Integer> list)
    {
        int max = list.get(list.size() - 1);
        for(Integer i : list)
        {
            if(max<i)
            {
                max = i;
            }
        }
        return max;
    }

    static int Min(List<Integer> list)
    {
        int min = list.get(0);
        for(Integer i : list)
        {
            if(min>i)
            {
                min = i;
            }
        }
        return min;
    }

    static Map<Integer, Integer> Counts(List<Integer> list)
    {
        Map<Integer, Integer>  map = new HashMap<>();
        for(Integer i : list)
        {
                if(map.containsKey(i))
                    map.replace(i, map.get(i) + 1);
                else
                    map.put(i , 1);

        }
        return map;
    }

    static List<Integer> fillList()
    {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целые числа или [end] для завершения ввода:");
        while(true)
        {
            String num = sc.next();
            if(num.equals("end")) return list;
            try{
                list.add(Integer.parseInt(num));
            }catch(Exception e)
            {
                System.out.println("Введено некорректное значение");
            }
        }
    }

    static Map<Integer, Integer> fillMap()
    {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println("Введите пары целых чисел или [end] для завершения ввода: ");
        while(true)
        {
            String num = sc.next();
            if(num.equals("end")) return map;
            try {
                Integer day = Integer.parseInt(num);
                Integer temperature =  Integer.parseInt(sc.next());
                if(day < 0) throw new Exception("День не может быть отрицательным");
                map.put(day,temperature);
            }catch(Exception e)
            {
                System.out.println("Некорректное значение. " +e.getMessage());
            }
        }
    }

    static void printMap(Map<Integer, Integer> map, String key, String value)
    {
        for(Integer k:map.keySet())
        {
            System.out.println(key + ": " + k + " "  + value + ": " + map.get(k));
        }
    }
}
