package Black_Belt.t_4_Iterable.collection.List.stack;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Andrey");
        stack.push("Misha");
        stack.push("Kolya");
        stack.push("Petya");
        System.out.println(stack); // [Andrey, Misha, Kolya, Petya]
        System.out.println(stack.pop()); // Petya  - удаляет последний элемент
        System.out.println(stack); // [Andrey, Misha, Kolya]
        System.out.println(stack.peek()); // Kolya - возвращает последний элемент

        while (!stack.empty()) { // пока Stack<String> stack не пуст
            stack.pop(); // удаляй последний элемент
        }
        System.out.println(stack);
    }
}
