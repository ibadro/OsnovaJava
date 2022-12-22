package Black_Belt.t_5_Nested_classes;

public class NestedClasses { /** public class - Top level */

public NestedClasses(){
    class D{}  /** local nested class in constructor*/
}
static class A{} /** static nested class */

class B{} /** inner nested class */

void method(){
    class C{} /** local nested class in method */
}
}

/** Существуют еще Anonymous classes */

/**
 * Nested classes
 *              (Вложенные классы)
 *                  static  INNER
 *              LOCAL           ANONYMOUS
 */