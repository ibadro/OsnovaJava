package Zaur_Tregulov.Black_Belt.t_4_Iterable.map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(16, 0.75F);
    }


    /**
     * В основе HashMap лежит массив. Элементами данного
     * массива являются структуры LinkedList. Данные
     * структуры LinkedList и заполняются элементами, которые
     * мы добавляем в HashMap.
     *
     * При создании HashMap мы можем задать 2 параметра,
     * которые очень влияют на производительность:
     * • Initial capacity – начальный размер массива; чем он
     * больше тем больше выделяется памяти и больше времени поиска
     * • Load factor – коэффициент того, насколько массив
     * должен быть заполнен, после чего его размер будет
     * увеличен вдвое. (в float) чем он больше тем меньше памяти
     * и больше времени поиска
     */
}
