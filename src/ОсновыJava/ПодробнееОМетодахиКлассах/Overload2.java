package ОсновыJava.ПодробнееОМетодахиКлассах;
/*Как следует из главы 2, в Java применяется автоматическое приведение типов,
которое распространяется и на типы параметров перегружаемых методов.
В качестве примера рассмотрим следующий фрагмент кода.
/* Автоматическое преобразование типов может влиять
на выбор перегружаемого метода.
*/
     class Overload2 {
        void f(int x) {
            System.out.println("Внутри f(int): " + x);
        }

        void f(double x) {
            System.out.println("Внутри f(double): " + x);
        }
    }
    class TypeConv {
        public static void main(String args[]) {
            Overload2 ob = new Overload2();
            int i = 10;
            double d = 10.1;
            byte b = 99;
            short s = 10;
            float f = 11.5F;
            ob.f(i); // вызов метода ob.f(int)
            ob.f(d); // вызов метода ob.f(double)
            ob.f(b); // вызов метода ob.f(int) с преобразованием типов
            ob.f(s); // вызов метода ob.f(int) с преобразованием типов
            ob.f(f); // вызов метода ob.f(double) с преобразованием типов
        }
    }

/*параметр типа i n t , а второй — параметр типа double. Но передать методу
f () можно также значение типа b y te , s h o r t и f lo a t . Значения типа b y te и
s h o r t исполняющая среда Java автоматически преобразует в тип in t. В результате
будет вызван вариант метода f ( i n t ) . А если параметр имеет значение типа
f lo a t , то оно преобразуется в тип double, и далее вызывается вариант метода
f (d o u b le ) .
Важно понимать, что автоматическое преобразование типов выполняется
лишь в отсутствие прямого соответствия типов параметра и аргумента. В качестве
примера ниже представлена другая версия предыдущей программы, в которой
добавлен вариант метода f () с параметром типа byte .*/
