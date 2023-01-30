package Задачи.zadania;

import java.util.HashSet;

public class Найти_повтор_элемнет {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 3, 6};
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                System.out.println("Повторяющееся число: " + arr[i]);
                break;
            }
            set.add(arr[i]);
        }
    }
}
/*Второй алгоритм. Использование HashMap для подсчета количества вхождений каждой строки с последующим выбором тех строк, для которых количество больше 1.

private static void oneMap(String[] data)
{
    Map<String, Integer> map = new HashMap<>();
    for (String str : data)
    {
        if (!map.containsKey(str))
        {
            map.put(str, 1);
        }
        else
        {
            map.put(str, map.get(str) + 1);
        }
    }
    List<String> duplicates = map.entrySet().stream()
            .filter(e -> e.getValue() > 1)
            .map(e -> e.getKey())
            .collect(Collectors.toList());
    System.out.println(duplicates.size());
}*/
/*Третий алгоритм. Использование двух HashSet: одного для уже найденных строк, второго - для хранения дубликатов.

private static void twoSets(String[] data)
{
    Set<String> foundStrings = new HashSet<>();
    Set<String> duplicates = new HashSet<>();
    for (String str : data)
    {
        if (foundStrings.contains(str))
        {
            duplicates.add(str);
        }
        else
        {
            foundStrings.add(str);
        }
    }
    System.out.println(duplicates.size());
}*/
/*Пятый алгоритм. Сортировка массива с последующим сравнением соседних элементов.

private static void sort(String[] data)
{
    Arrays.sort(data);
    Set<String> duplicates = new HashSet<>();
    for (int i = 1; i < data.length; i++)
    {
        if (data[i - 1].equals(data[i]))
        {
            duplicates.add(data[i]);
        }
    }
    System.out.println(duplicates.size());
}*/