package Black_Belt.t_3_Generics;

import java.util.ArrayList;
import java.util.List;

public class SubTypeGenerics {
    public static void main(String[] args) {
        X x = new Y();
        List<X> list1 = new ArrayList<>();
        /*
        нельзя писать new ArrayList<>(Y) т.к. совокупность ArrayList<>(Y)
        не является подтипом  совокупности List<X>, при то что ArrayList является подклассом List
         */

        List<Number> list2 = new ArrayList<>(); // нельзя написать <Integer>
        list2.add(18);
        list2.add(3.14);
    }
}

class X{}
class Y extends X{}