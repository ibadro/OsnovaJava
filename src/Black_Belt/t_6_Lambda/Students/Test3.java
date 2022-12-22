package Black_Belt.t_6_Lambda.Students;

public class Test3 {
    static void def(Interface i){
        System.out.println(i.abc("privet"));
    }

    static void def2(Interface2 i){
        System.out.println(i.abc());
    }

    public static void main(String[] args) {
        def((String str)->{return str.length();});
        // str видна только внутри лямбда выражения
        def2(() ->{ return 18;});
    }
}

interface Interface{
    int abc(String s);
}

interface Interface2{
    int abc();
}

